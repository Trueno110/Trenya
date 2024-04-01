package com.example.trenya.button_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Modifier

@Composable
fun Screen1() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(Color(0xFF000000),
                Color(0xFFFFFDFD)
                    )
                )
            ),
        text = "Screen 1",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(
                Color(0xFF030000),
                Color(0xFF990404)
            ))),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(listOf(Color(0xFF002AFF),
                Color(0xFF000000)
            ))),
        text = "Screen 3",
        textAlign = TextAlign.Center,

        )
}

