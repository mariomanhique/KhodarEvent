package com.mariomanhique.khodarevent.presentation.screens.splash.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mariomanhique.khodarevent.presentation.screens.splash.SplashScreen

const val splashNavigationRoute = "splashRoute"

fun NavGraphBuilder.splashRoute(
  navigateToHome: () -> Unit
){

  composable(route = splashNavigationRoute){
    SplashScreen(
      navigateToHome = {
        navigateToHome()
      }
    )
  }

}