package com.example.tp3_mvp.mvp.view.base // ktlint-disable package-name

import android.app.Activity
import java.lang.ref.WeakReference

open class ActivityView(activity: Activity) {
    private val activityRef: WeakReference<Activity> = WeakReference(activity)

    val activity: Activity?
        get() = activityRef.get()
}
