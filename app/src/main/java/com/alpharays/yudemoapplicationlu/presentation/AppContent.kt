package com.alpharays.yudemoapplicationlu.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.alpharays.yudemoapplicationlu.presentation.navigation.Navigation

@Composable
fun AppContent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Navigation()
    }
}