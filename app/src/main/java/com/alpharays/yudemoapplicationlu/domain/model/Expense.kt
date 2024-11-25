package com.alpharays.yudemoapplicationlu.domain.model

data class Expense(
    val category: String,
    val amount: Double,
    val date: String,
    val description: String,
    val title: String
)
