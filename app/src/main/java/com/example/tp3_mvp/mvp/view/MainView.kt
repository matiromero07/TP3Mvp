package com.example.tp3_mvp.mvp.view // ktlint-disable package-name

import android.app.Activity
import android.widget.Toast
import com.example.tp3_mvp.databinding.ActivityMainBinding
import com.example.tp3_mvp.mvp.contract.MainContract
import com.example.tp3_mvp.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun txtMessage(): String {
        return binding.txtText.text.toString()
    }
    override fun showText(txt: String) {
        Toast.makeText(activity, txt, Toast.LENGTH_SHORT).show()
    }

    override fun clickButton(function: () -> Unit) {
        binding.btnText.setOnClickListener { function() }
    }
}
