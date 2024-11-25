package com.alpharays.yudemoapplicationlu.presentation

import androidx.lifecycle.ViewModel
import com.alpharays.yudemoapplicationlu.domain.ExpenseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExpenseViewModel @Inject constructor(
    private val expenseRepository: ExpenseRepository
) : ViewModel() {

    fun addExpense() {

    }

    fun getAllExpense() {

    }
}