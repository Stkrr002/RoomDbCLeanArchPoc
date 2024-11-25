package com.alpharays.yudemoapplicationlu.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: ExpenseEntity): Long

    @Query("SELECT * FROM expense_details WHERE category=:category")
    suspend fun getAllExpenses(category: String): List<ExpenseEntity>


}