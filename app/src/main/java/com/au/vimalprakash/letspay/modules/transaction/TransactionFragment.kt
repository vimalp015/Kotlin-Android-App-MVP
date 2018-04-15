package com.au.vimalprakash.letspay.modules.transaction

import android.app.ProgressDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.au.vimalprakash.letspay.LetsPayApplication
import com.au.vimalprakash.letspay.R
import java.util.*
import javax.inject.Inject

/**
 * Fragment to display transactions using a Recycler View
 * NOTE: I have used this deprecated ProgressDialog for this demo purpose. In real project we do not use any deprecated things.
 */

class TransactionFragment : Fragment(), TransactionContract.View {

    @BindView(R.id.swipe_container)
    lateinit var mSwipeContainer: SwipeRefreshLayout

    @BindView(R.id.recycler_view)
    lateinit var mRecyclerView: RecyclerView

    @BindView(R.id.error_loading_layout)
    lateinit var mErrorLoadingLayout: View

    private var mAdapter: TransactionAdapter? = null

    private var progress: ProgressDialog? = null

    @Inject
    lateinit var mPresenter: TransactionContract.Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_account_details, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ButterKnife.bind(this, view!!)

        //inject our presenter here
        LetsPayApplication.instance!!.activityComponents.inject(this)

        val layoutManager = LinearLayoutManager(context)
        mRecyclerView.layoutManager = layoutManager
        mAdapter = TransactionAdapter(mPresenter)
        mRecyclerView.adapter = mAdapter

        mSwipeContainer.setOnRefreshListener { mPresenter.getAccountDetails() }
    }

    override fun onResume() {
        super.onResume()
        mPresenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()
        mPresenter.detachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.clearDisposables()
    }

    override fun updateTransactions() {
        mAdapter!!.notifyDataSetChanged()
    }

    override fun showLoading() {
        if (progress == null) {
            progress = ProgressDialog(context)
            progress!!.setTitle(resources.getString(R.string.loading_title))
            progress!!.setMessage(resources.getString(R.string.loading_message))
        }
        if (!progress!!.isShowing) {
            progress!!.show()
        }
    }

    override fun hideLoading() {
        mSwipeContainer.isRefreshing = false
        if (progress != null && progress!!.isShowing) {
            progress!!.dismiss()
        }
    }

    override fun setCouldNotLoadLayoutVisibility(showCouldNotLoadLayout: Boolean) {
        if (showCouldNotLoadLayout) {
            mErrorLoadingLayout.visibility = VISIBLE
            mSwipeContainer.visibility = GONE
        } else {
            mSwipeContainer.visibility = VISIBLE
            mErrorLoadingLayout.visibility = GONE
        }
    }

    /**
     * when user clicks on a row with ATM transaction, we need to take the user to Google Maps to display the location of the ATM
     */
    override fun showAtmLocationOnMap(latitude: String, longitude: String, locationName: String) {
        val googleMapsActivity = Intent(Intent.ACTION_VIEW,
                Uri.parse(String.format(Locale.ENGLISH, "geo:%s,%s", latitude, longitude) +
                        "?q=" + Uri.encode("$latitude,$longitude($locationName)") +
                        "&z=16"))
        googleMapsActivity.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity")

        try {
            startActivity(googleMapsActivity)
        } catch (notFoundEx: ActivityNotFoundException) {
            showGoogleMapsNotInstalledToast()
        } catch (notFoundEx: NullPointerException) {
            showGoogleMapsNotInstalledToast()
        } catch (notFoundEx: SecurityException) {
            showGoogleMapsNotInstalledToast()
        }

    }

    private fun showGoogleMapsNotInstalledToast() {
        Toast.makeText(this.context, "Oops! We couldn't find Google Maps installed on your device", Toast.LENGTH_LONG).show()
    }

    @OnClick(R.id.try_again_button)
    fun onTryAgain() {
        mPresenter.getAccountDetails()
    }

    companion object {

        val TAG = "transactions_fragment_tag"
    }
}
