package com.alpharays.yudemoapplicationlu.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpharays.yudemoapplicationlu.domain.ExpenseRepository
import com.alpharays.yudemoapplicationlu.domain.model.Expense
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExpenseViewModel @Inject constructor(
    private val expenseRepository: ExpenseRepository
) : ViewModel() {

    private val _expenseList = MutableStateFlow<List<Expense>>(emptyList())
    val expenseList: StateFlow<List<Expense>> = _expenseList


    fun addExpense(
        expense: Expense
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            expenseRepository.addExpense(
                expense = expense
            )
        }
    }

    fun getAllExpense() {
        viewModelScope.launch(Dispatchers.IO) {
            expenseRepository.getAllExpense().collect {
                _expenseList.value = it
            }
        }

    }
}