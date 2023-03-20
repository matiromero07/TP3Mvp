package com.example.tp3_mvp.activity // ktlint-disable package-name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp3_mvp.mvp.presenter.MainPresenter
import com.example.tp3_mvp.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
    }
}
