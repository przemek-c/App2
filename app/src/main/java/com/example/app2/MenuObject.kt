package com.example.app2

data class MenuObject(
    val icon: Int,
    val name: String,
    val menuObjectRoute: String
)
val objects = listOf(
    MenuObject(
        R.drawable.menu_icon_active,
        "Active",
        Screen.Active.route
    ),
    MenuObject(
        R.drawable.menu_icon_kcp,
        "Kcp",
        Screen.Kcp.route
    ),
    MenuObject(
        R.drawable.menu_icon_commonly_used,
        "Commonly used",
        Screen.Commonly.route
    ),
    MenuObject(
        R.drawable.menu_icon_others,
        "Others",
        Screen.Others.route
    ),


)
