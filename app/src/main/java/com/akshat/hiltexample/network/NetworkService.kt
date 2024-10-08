package com.akshat.hiltexample.network

import android.net.Uri.Builder
import android.util.Log
import androidx.core.graphics.createBitmap
import com.akshat.hiltexample.TAG

class NetworkService private constructor(builder: Builder) {

    private val protocol: String?
    private val host: String?
    private val path: String?
    private val interceptor: Interceptor?

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.interceptor = builder.interceptor
    }

    fun performNetworkCall() {
        interceptor?.log("call performed")
        Log.d(TAG, "Network call performed : $this")
    }

    class Builder {
        var protocol: String? = null
            private set
        var host: String? = null
            private set
        var path: String? = null
            private set
        var interceptor: Interceptor? = null
            private set

        fun protocol(protocol: String) = apply {
            this.protocol = protocol
        }

        fun host(host: String) = apply {
            this.host = host
        }

        fun path(path: String) = apply {
            this.path = path
        }

        fun interceptor(interceptor: Interceptor) = apply {
            this.interceptor = interceptor
        }

        fun build() = NetworkService(this)


    }
}