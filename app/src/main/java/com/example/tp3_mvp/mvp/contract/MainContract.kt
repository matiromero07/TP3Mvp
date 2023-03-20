package com.example.tp3_mvp.mvp.contract // ktlint-disable package-name

interface MainContract {
    interface Presenter {
        fun onButtonPressed(text: String)
    }
    interface View {
        fun showText(text: String)
    }
}
