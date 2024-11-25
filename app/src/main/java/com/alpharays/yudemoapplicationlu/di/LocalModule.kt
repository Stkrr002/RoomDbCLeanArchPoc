package com.alpharays.yudemoapplicationlu.di

import android.content.Context
import androidx.room.Room
import com.alpharays.yudemoapplicationlu.data.ExpenseDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class LocalModule {
    @Provides
    @Singleton
    fun provideExpenseDataBase(@ApplicationContext context: Context): ExpenseDataBase {
        return Room.databaseBuilder(
            context,
            ExpenseDataBase::class.java, "expense-tracker-app"
        ).build()
    }

    @Provides
    @Singleton
    fun providesExpenseDao(expenseDataBase: ExpenseDataBase) = expenseDataBase.expenseDao()
}