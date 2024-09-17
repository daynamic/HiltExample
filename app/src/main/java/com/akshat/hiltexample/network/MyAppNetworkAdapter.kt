package com.akshat.hiltexample.network

import android.util.Log
import com.akshat.hiltexample.TAG
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor() : NetworkAdapter {
    override fun log(message: String) {
        Log.d(TAG, "MyNetworkAdapter: $message")
    }
}