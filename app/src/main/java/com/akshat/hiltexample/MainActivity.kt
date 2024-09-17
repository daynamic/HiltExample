package com.akshat.hiltexample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.akshat.hiltexample.database.DatabaseAdapter
import com.akshat.hiltexample.database.DatabaseService
import com.akshat.hiltexample.hilt.CallInterceptor
import com.akshat.hiltexample.network.NetworkAdapter
import com.akshat.hiltexample.network.NetworkService
import com.akshat.hiltexample.stats.StatsViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseAdapter: DatabaseAdapter

    @CallInterceptor
    @Inject
    lateinit var networkService: NetworkService
    //   lateinit var networkAdapter: NetworkAdapter

    private val statsVewModel: StatsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "DatabaseAdapter : $databaseAdapter")
        databaseAdapter.log("Hello Hilt")

        //      networkAdapter.log("Interface Binding")
        networkService.performNetworkCall()

        statsVewModel.statsLiveData.observe(this) { stats ->
            Log.d(TAG, "New stats comming in : $stats")
        }
        statsVewModel.startStatsCollection()
    }

    @Inject
    fun directToDatabase(databaseService: DatabaseService) {
        databaseService.log("Method injection")
    }
}