package com.au.vimalprakash.letspay.modules.mainactivity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import com.au.vimalprakash.letspay.LetsPayApplication
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.TransactionFragment

import javax.inject.Inject

/**
 * This activity acts as a container for hosting our fragments
 */

class MainActivity : AppCompatActivity(), MainAcivityContract.View {

    @Inject
    lateinit var mPresenter: MainAcivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //inject our presenter here
        LetsPayApplication.instance!!.activityComponents.inject(this)

        loadFragment(TransactionFragment(), TransactionFragment.TAG)
    }

    override fun onResume() {
        super.onResume()
        mPresenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()
        mPresenter.detachView()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }

    private fun loadFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container_framelayout, fragment).addToBackStack(tag)
                .commit()
    }
}
