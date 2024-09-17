package com.akshat.hiltexample.database

import android.content.Context
import android.util.Log
import com.akshat.hiltexample.TAG
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(
    @ActivityContext private val context: Context,
    var databaseService: DatabaseService) {
 fun log(message : String){
     Log.d(TAG, "DatabaseAdapter : $message" )
     databaseService.log(message)
     Log.d(TAG, "Context : $context" )
 }

}