package com.akshat.hiltexample.stats

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(): ViewModel() {

    val statsLiveData = MutableLiveData<Int>()
   private var i =0
    private var runnable : Runnable? = null

    fun startStatsCollection(){
        val h = Handler(Looper.getMainLooper())
        runnable = Runnable {
            statsLiveData.value = ++i
            h.postDelayed(runnable!!, 500)
        }
        h.postDelayed(runnable!!, 500)
    }

}