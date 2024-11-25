package com.alpharays.yudemoapplicationlu.domain

import com.alpharays.yudemoapplicationlu.domain.model.Expense
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {
    suspend fun addExpense()
    suspend fun getAllExpense(): Flow<List<Expense>>

}