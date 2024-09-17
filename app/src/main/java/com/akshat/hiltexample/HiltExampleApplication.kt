package com.akshat.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltExampleLogTag"

@HiltAndroidApp
class HiltExampleApplication: Application() {
}