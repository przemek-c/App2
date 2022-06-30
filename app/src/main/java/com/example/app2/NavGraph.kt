package com.example.app2

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
    startDestination = Screen.Login.route
    ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Home.route
        ){
            HomeMenu(objectList = objects, navController = rememberNavController())
        }
        composable(
            route = Screen.Active.route
        ){
            ActiveScreen(navController = navController)
        }
        composable(
            route = Screen.Kcp.route
        ){
            KcpScreen(navController = navController)
        }
        composable(
            route = Screen.Commonly.route
        ){
            CommonlyScreen(navController = navController)
        }
        composable(
            route = Screen.Others.route
        ){
            OthersScreen(navController = navController)
        }
    }
}