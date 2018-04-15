package com.au.vimalprakash.letspay.modules.mainactivity

/**
 * Since this Activity acts only as a container for our fragment,
 * the presenter hardly does anything
 */

class MainActivityPresenter : MainAcivityContract.Presenter {

    private var mView: MainAcivityContract.View? = null

    override fun attachView(view: MainAcivityContract.View) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}
