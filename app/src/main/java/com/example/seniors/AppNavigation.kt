package com.example.seniors

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.seniors.views.LoginUI
import com.example.seniors.views.RegisterUi

@Composable
fun AppNavigation(){
        val navController = rememberNavController()
       NavHost(navController = navController, startDestination = Routes.LOGIN) {
               composable(Routes.LOGIN){ LoginUI(navController)}
               composable(Routes.REGISTER){ RegisterUi(navController)}
       }
}