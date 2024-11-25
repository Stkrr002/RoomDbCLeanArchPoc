package com.alpharays.yudemoapplicationlu.di

import com.alpharays.yudemoapplicationlu.data.ExpenseRepositoryImpl
import com.alpharays.yudemoapplicationlu.domain.ExpenseRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    abstract fun providesExpenseRepository(impl: ExpenseRepositoryImpl): ExpenseRepository

}