package com.mariomanhique.khodarevent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mariomanhique.khodarevent.presentation.screens.home.HomeScreen
import com.mariomanhique.khodarevent.presentation.screens.home.navigation.homeRoute
import com.mariomanhique.khodarevent.presentation.screens.home.navigation.navigateToHome
import com.mariomanhique.khodarevent.presentation.screens.splash.SplashScreen
import com.mariomanhique.khodarevent.presentation.screens.splash.navigation.splashNavigationRoute
import com.mariomanhique.khodarevent.presentation.screens.splash.navigation.splashRoute


@Composable
fun KhodarNavHost(

){

    val controller = rememberNavController()

    NavHost(navController = controller, startDestination = splashNavigationRoute){

        homeRoute()

        splashRoute(
            navigateToHome = {
                controller.navigateToHome()
            }
        )




    }

}



