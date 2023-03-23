package com.example.tp3_mvp.mvp.presenter // ktlint-disable package-name

import com.example.tp3_mvp.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    init {
        view.clickButton { onButtonPressed() }
    }
    override fun onButtonPressed() {
        view.showText(view.txtMessage())
    }
}
