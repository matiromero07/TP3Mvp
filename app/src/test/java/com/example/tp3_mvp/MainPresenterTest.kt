package com.example.tp3_mvp // ktlint-disable package-name

import com.example.tp3_mvp.mvp.contract.MainContract
import com.example.tp3_mvp.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: MainContract.Presenter

    @RelaxedMockK
    private lateinit var mainView: MainContract.View

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun WhenTextIsInsertedAToastBeDisplayed() {
        every { mainView.showText("Hello") }
        mainPresenter.onButtonPressed()
        verify { mainView.showText("Hello") }
    }
}
