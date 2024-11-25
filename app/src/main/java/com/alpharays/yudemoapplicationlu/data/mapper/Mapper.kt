package com.alpharays.yudemoapplicationlu.data.mapper

import com.alpharays.yudemoapplicationlu.data.ExpenseEntity
import com.alpharays.yudemoapplicationlu.domain.model.Expense

fun ExpenseEntity.toExpense() = Expense(
    category = category,
    amount = amount,
    date = date,
    description = description,
    title = title
)

fun Expense.toExpenseEntity() = ExpenseEntity(
    category = category,
    amount = amount,
    date = date,
    description = description,
    title = title
)