package com.alpharays.yudemoapplicationlu.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alpharays.yudemoapplicationlu.presentation.navigation.NavigationConstants.DeepLinks.EXPENSE_DETAILS_SCREEN
import com.alpharays.yudemoapplicationlu.presentation.navigation.NavigationConstants.DeepLinks.EXPENSE_HOME_SCREEN
import com.alpharays.yudemoapplicationlu.presentation.screen.ExpenseDetailsScreen
import com.alpharays.yudemoapplicationlu.presentation.screen.ExpenseHomeScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = EXPENSE_HOME_SCREEN) {
        composable(EXPENSE_HOME_SCREEN) { ExpenseHomeScreen() }
        composable(EXPENSE_DETAILS_SCREEN) { ExpenseDetailsScreen() }
    }
}