package com.example.tp3_mvp.mvp.contract // ktlint-disable package-name

interface MainContract {
    interface View {
        fun showText(txt: String)
        fun clickButton(function: () -> Unit)
        fun txtMessage(): String
    }

    interface Presenter {
        fun onButtonPressed()
    }
}
