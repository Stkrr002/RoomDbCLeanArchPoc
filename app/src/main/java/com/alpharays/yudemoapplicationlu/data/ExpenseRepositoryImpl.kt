package com.alpharays.yudemoapplicationlu.data

import com.alpharays.yudemoapplicationlu.domain.ExpenseRepository
import com.alpharays.yudemoapplicationlu.domain.model.Expense
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {
    override suspend fun addExpense() {

    }

    override suspend fun getAllExpense(): Flow<List<Expense>> {
    }
}