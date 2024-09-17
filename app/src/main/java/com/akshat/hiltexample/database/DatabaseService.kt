package com.akshat.hiltexample.database

import android.util.Log
import com.akshat.hiltexample.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(message: String){
        Log.d(TAG, "Database Service message : $message")
    }
}