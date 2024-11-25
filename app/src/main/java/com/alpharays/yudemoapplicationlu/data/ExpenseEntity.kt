package com.alpharays.yudemoapplicationlu.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense_details")
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val category: String,
    val amount: Double,
    val date: String,
    val description: String,
    val title: String
)
