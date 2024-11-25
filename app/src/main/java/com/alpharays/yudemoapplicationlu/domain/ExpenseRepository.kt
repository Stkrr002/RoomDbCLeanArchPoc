package com.alpharays.yudemoapplicationlu.domain

import com.alpharays.yudemoapplicationlu.domain.model.Expense
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {
    suspend fun addExpense(expense: Expense)
    suspend fun getAllExpense(): Flow<List<Expense>>

}