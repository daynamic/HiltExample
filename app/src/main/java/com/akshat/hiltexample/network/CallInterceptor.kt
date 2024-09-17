package com.akshat.hiltexample.network

import android.util.Log
import com.akshat.hiltexample.TAG
import javax.inject.Inject

class CallInterceptor @Inject constructor(): Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "This is a call interceptor : $message")
    }
}