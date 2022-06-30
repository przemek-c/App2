package com.example.app2

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeMenuCard(navController: NavController, icon: Int, name: String, menuObjectRoute: String){
    
    Column(
        modifier = Modifier
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .padding(all = 8.dp)
                .clickable {
                    navController.navigate(route = menuObjectRoute)
                }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeMenu(objectList: List<MenuObject>, navController: NavController){
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = 20.dp)
    ){
        items(objectList){
            item -> HomeMenuCard(
            navController = rememberNavController(), 
            icon = item.icon, 
            name = item.name, 
            menuObjectRoute = item.menuObjectRoute)
        }
    }
    Image(
        painter = painterResource(R.drawable.menu_bottom_image),
        contentDescription = null,
        modifier = Modifier
            .size(120.dp),
        alignment = BottomCenter
    )
}

@Composable
fun HomeScreen(
    navController: NavController
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colorScheme.primary,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(horizontal = 20.dp))
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Active.route)
            },
            text = "Active",
            color = MaterialTheme.colorScheme.primary,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
@Preview (showBackground = true)
fun HomeScreenPreview() {
    HomeMenu(objectList = objects, navController = rememberNavController())
}