package com.sangik.mvvmstudy.util

import android.app.Activity
import com.sangik.mvvmstudy.view.mocky.MockyActivity
import android.content.Intent

class ActivityUtil {
    fun startMockyActivity(activity: Activity){
        val intent = Intent(activity, MockyActivity::class.java)
        activity.startActivity(intent)
    }
}