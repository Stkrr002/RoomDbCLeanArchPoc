package com.alpharays.yudemoapplicationlu.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.alpharays.yudemoapplicationlu.domain.model.Expense
import com.alpharays.yudemoapplicationlu.presentation.ExpenseViewModel

@Composable
fun ExpenseHomeScreen() {
    val expenseViewModel: ExpenseViewModel = hiltViewModel()

    val expenseList = expenseViewModel.expenseList.collectAsState()

    LaunchedEffect(Unit) {
        expenseViewModel.getAllExpense()
    }

    Scaffold(
        modifier = Modifier.padding(10.dp),
        topBar = {
            Text(text = "Expense screen")
        },
        bottomBar = {
            Button(onClick = {
                expenseViewModel.addExpense(
                    Expense(
                        category = "travel",
                        amount = 50.0,
                        date = "12/12/2023",
                        title = "Lunch",
                        description = "nice one"
                    )
                )
            }) {
                Text(text = "Add Expense")
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
        ) {
            items(expenseList.value) { expense ->
                ExpenseItem(expense = expense)
            }

        }


    }

}

@Composable
fun ExpenseItem(expense: Expense) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        colors = CardDefaults.cardColors(Color.Red),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(expense.title)
            Text(expense.category)
            Text(expense.date)
            Text(expense.amount.toString())
        }

    }

}