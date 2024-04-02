package com.sangik.mvvmstudy.util

import android.app.Activity
import com.sangik.mvvmstudy.view.naver.NaverApiActivity
import android.content.Intent

class ActivityUtil {
    fun startNaverApiActivity(activity: Activity){
        val intent = Intent(activity, NaverApiActivity::class.java)
        activity.startActivity(intent)
    }
}