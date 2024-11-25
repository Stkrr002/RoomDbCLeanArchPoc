package com.alpharays.yudemoapplicationlu.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class LocalModule {
    @Provides
    fun provideExpenseDataBase(){

    }
}