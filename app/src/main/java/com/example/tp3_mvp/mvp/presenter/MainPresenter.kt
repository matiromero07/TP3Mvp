package com.example.tp3_mvp.mvp.presenter // ktlint-disable package-name

import com.example.tp3_mvp.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    override fun onButtonPressed(text: String) {
        view.showText(text)
    }
}
