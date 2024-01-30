package com.mariomanhique.khodarevent.presentation.screens.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mariomanhique.khodarevent.presentation.screens.home.HomeScreen
import com.mariomanhique.khodarevent.presentation.screens.splash.SplashScreen

const val homeNavigationRoute = "homeRoute"

fun NavController.navigateToHome(){
    navigate(homeNavigationRoute)
}

fun NavGraphBuilder.homeRoute(
){

    composable(route = homeNavigationRoute){
       HomeScreen()
    }
}