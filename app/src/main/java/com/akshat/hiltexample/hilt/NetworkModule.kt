package com.akshat.hiltexample.hilt

import com.akshat.hiltexample.network.MyAppNetworkAdapter
import com.akshat.hiltexample.network.NetworkAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {

    @Binds
    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter
}