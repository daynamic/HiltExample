package com.akshat.hiltexample.hilt

import com.akshat.hiltexample.network.MyAppNetworkAdapter
import com.akshat.hiltexample.network.NetworkAdapter
import com.akshat.hiltexample.network.NetworkService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
 class NetworkModule {

   /* @Binds
    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter*/


     @Provides
     fun provideNetworkService(): NetworkService{
         return NetworkService.Builder()
             .host("google.com")
             .protocol("https")
             .build()
     }


}