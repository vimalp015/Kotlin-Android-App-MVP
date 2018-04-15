package com.au.vimalprakash.letspay.modules.mainactivity


interface MainAcivityContract {
    interface View

    interface Presenter {

        fun attachView(view: View)

        fun detachView()

    }
}
