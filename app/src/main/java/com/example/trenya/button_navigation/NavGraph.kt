package com.example.testbarapp.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trenya.button_navigation.Screen1
import com.example.trenya.button_navigation.Screen2
import com.example.trenya.button_navigation.Screen3

@Composable
fun NavGraph(
    navHostControleer: NavHostController
) {
    NavHost(navController = navHostControleer, startDestination = "screen_1") {
        composable("screen_1") {
            Screen1()
        }
        composable("screen_2") {
            Screen2()
        }
        composable("screen_3") {
            Screen3()
        }
    }
}