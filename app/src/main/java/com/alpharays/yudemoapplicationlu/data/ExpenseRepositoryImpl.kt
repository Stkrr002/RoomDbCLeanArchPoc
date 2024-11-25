package com.alpharays.yudemoapplicationlu.data

import com.alpharays.yudemoapplicationlu.data.mapper.toExpense
import com.alpharays.yudemoapplicationlu.data.mapper.toExpenseEntity
import com.alpharays.yudemoapplicationlu.domain.ExpenseRepository
import com.alpharays.yudemoapplicationlu.domain.model.Expense
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {
    override suspend fun addExpense(expense: Expense) {
        expenseDao.insertExpense(expense.toExpenseEntity())
    }

    override suspend fun getAllExpense(): Flow<List<Expense>> {
        val expenseList = flow {
            emit(
                expenseDao.getAllExpenses().map {
                    it.toExpense()
                }
            )
        }
        return expenseList
    }
}