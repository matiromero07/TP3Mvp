package com.example.tp3_mvp.mvp.view // ktlint-disable package-name

import android.app.Activity
import android.widget.Toast
import com.example.tp3_mvp.mvp.contract.MainContract
import com.example.tp3_mvp.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    override fun showText(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
    }
}
