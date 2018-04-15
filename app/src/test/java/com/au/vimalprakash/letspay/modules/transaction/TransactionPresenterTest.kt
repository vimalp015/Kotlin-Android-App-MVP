package com.au.vimalprakash.letspay.modules.transaction

import com.au.vimalprakash.letspay.networking.LetsPayApi
import com.au.vimalprakash.letspay.networking.responsemodels.*
import com.au.vimalprakash.letspay.testutils.TestSchedulersProvider
import com.au.vimalprakash.letspay.utils.Helper
import io.reactivex.Single
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations.initMocks
import java.util.*
import kotlin.collections.ArrayList

/**
 * Units tests to cover as much as possible behaviours of our Transaction Presenter
 * All the method names are self explanatory
 */

class TransactionPresenterTest {

    @Mock
    private lateinit var view: TransactionContract.View

    @Mock
    private lateinit var letsPayApi: LetsPayApi

    private lateinit var presenter: TransactionPresenter

    @Before
    fun setup() {
        initMocks(this)

        Mockito.`when`(letsPayApi.accountDetails).thenReturn(Single.just(getServerResponse()))

        presenter = TransactionPresenter(letsPayApi, TestSchedulersProvider())
    }

    @Test
    fun showLoadingWhenLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).showLoading()
    }

    @Test
    fun hideLoadingAfterSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).hideLoading()
    }

    @Test
    fun updateTransactionsOnSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).updateTransactions()
    }

    @Test
    fun hideLoadLayoutOnSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).setCouldNotLoadLayoutVisibility(false)
    }

    @Test
    fun hideLoadingAfterErrorOnLoadingDetails() {
        //given
        Mockito.`when`(letsPayApi.accountDetails).thenReturn(Single.error(Exception()))
        presenter = TransactionPresenter(letsPayApi, TestSchedulersProvider())

        //when
        presenter.attachView(view)

        //then
        verify(view).hideLoading()
    }

    @Test
    fun verifyTransactionRowModelCountAfterLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        //should have 5 rows, summary, 2 header, and 2 transactions
        assertTrue(presenter.itemCount == 5)
    }

    @Test
    fun verifyTransactionRowModelCountAfterRefresh() {
        //given
        presenter.attachView(view)

        //when
        presenter.getAccountDetails()

        //then
        //should have 5 rows, summary, 2 header, and 2 transactions
        assertTrue(presenter.itemCount == 5)
    }

    @Test
    fun verifyTransactionsAreSortedOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        //after sorting, the 3rd position should have pending transaction type and 4th position should have completed transaction
        assertTrue(presenter.getItemViewType(2) == Helper.TransactionType.PENDING_TRANSACTION.value)
        assertTrue(presenter.getItemViewType(4) == Helper.TransactionType.COMPLETED_TRANSACTION.value)
    }

    @Test
    fun verifyTransactionRowModelsData() {
        //when
        presenter.attachView(view)

        //then
        assertTrue(presenter.getItemViewType(0) == Helper.TransactionType.ACCOUNT_SUMMARY.value)
        assertTrue(presenter.getItemViewType(1) == Helper.TransactionType.TRANSACTION_HEADER.value)
        assertTrue(presenter.getItemViewType(2) == Helper.TransactionType.PENDING_TRANSACTION.value)
        assertTrue(presenter.getItemViewType(3) == Helper.TransactionType.TRANSACTION_HEADER.value)
        assertTrue(presenter.getItemViewType(4) == Helper.TransactionType.COMPLETED_TRANSACTION.value)
    }

    @Test
    fun showCouldNotLoadLayoutOnError() {
        //given
        Mockito.`when`(letsPayApi.accountDetails).thenReturn(Single.error(Exception()))
        presenter = TransactionPresenter(letsPayApi, TestSchedulersProvider())

        //when
        presenter.attachView(view)

        //then
        verify(view).setCouldNotLoadLayoutVisibility(true)
    }

    @Test
    fun verifyAccountSummaryViewHolderIsSet() {
        //given
        val accountSummaryViewHolder = mock(TransactionContract.AccountSummaryViewHolder::class.java)
        presenter.attachView(view)

        //when
        presenter.onBindViewHolderAtPosition(accountSummaryViewHolder, 0)

        //then
        verify(accountSummaryViewHolder).setAccountName("account name")
        verify(accountSummaryViewHolder).setAccountNumber("account number")
        verify(accountSummaryViewHolder).setAvailableFunds("$1,000.00")
        verify(accountSummaryViewHolder).setAccountBalance("$500.00")
    }

    @Test
    fun verifyTransactionHeaderViewHolderIsSet() {
        //given
        val transactionHeaderViewHolder = mock(TransactionContract.TransactionHeaderViewHolder::class.java)
        presenter.attachView(view)

        //when
        presenter.onBindViewHolderAtPosition(transactionHeaderViewHolder, 1)

        //then
        verify(transactionHeaderViewHolder).setTransactionDate(anyString())
        verify(transactionHeaderViewHolder).setTransactionDuration(anyString())
    }

    @Test
    fun verifyTransactionDetailsViewHolderIsSet() {
        //given
        val transactionDetailsViewHolder = mock(TransactionContract.TransactionDetailsViewHolder::class.java)
        presenter.attachView(view)

        //when
        presenter.onBindViewHolderAtPosition(transactionDetailsViewHolder, 4)

        //then
        verify(transactionDetailsViewHolder).setAtmIconVisibility(true)
        verify(transactionDetailsViewHolder).setAvailableFunds("$200.00")
        verify(transactionDetailsViewHolder).setPendingLabelVisibility(false)
        verify(transactionDetailsViewHolder).setTransactionDescription("completed desc")
    }

    @Test
    fun verifyShowAtmLocationIsInvoked() {
        //given
        presenter.attachView(view)

        //when
        presenter.showAtmLocation(4)

        //then
        verify(view).showAtmLocationOnMap("-33.861382", "151.210316", "atm name")
    }

    private fun getServerResponse(): ServerResponse {
        val serverResponse = ServerResponse()

        //set summary for the transactions
        serverResponse.account = AccountSummary()
        serverResponse.account?.accountName = "account name"
        serverResponse.account?.accountNumber = "account number"
        serverResponse.account?.available = 1000.00
        serverResponse.account?.balance = 500.00

        //Set a completed transaction with yesterday's date
        val transactionCompletedList: ArrayList<TransactionCompleted> = ArrayList()
        var transactionCompleted = TransactionCompleted()
        transactionCompleted.id = "completed id"
        val yesterday = Calendar.getInstance()
        yesterday.add(Calendar.DATE, -1)
        transactionCompleted.effectiveDate = yesterday.time
        transactionCompleted.description = "completed desc"
        transactionCompleted.amount = 200.00
        transactionCompleted.atmId = "atm id"
        transactionCompletedList.add(transactionCompleted)
        serverResponse.transactionCompleteds = transactionCompletedList

        //Set a pending transaction with today's date
        val transactionPendingList: ArrayList<TransactionPending> = ArrayList()
        var transactionPending = TransactionPending()
        transactionPending.id = "pending id"
        transactionPending.effectiveDate = Calendar.getInstance().time
        transactionPending.amount = 250.00
        transactionPending.description = "pending desc"
        transactionPendingList.add(transactionPending)
        serverResponse.transactionPending = transactionPendingList

        //set ATM locations list
        val atmList: ArrayList<Atm> = ArrayList()
        var atm = Atm()
        atm.id = "atm id"
        atm.name = "atm name"
        atm.address = "atm address"
        val location = Location()
        location.lat = -33.861382
        location.lng = 151.210316
        atm.location = location
        atmList.add(atm)
        serverResponse.atms = atmList

        return serverResponse
    }
}