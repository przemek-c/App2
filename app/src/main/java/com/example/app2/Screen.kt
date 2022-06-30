package com.example.app2

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Login: Screen(route = "login_screen")
    object Active: Screen(route = "active_screen")
    object Kcp: Screen(route = "kcp_screen")
    object Commonly: Screen(route = "commonly_screen")
    object Others: Screen(route = "others_screen")
}
