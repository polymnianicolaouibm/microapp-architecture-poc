package com.example.microapppoc

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.featurea.FeatureAScreen
import com.example.featurez.FeatureZScreen


@Composable
fun NavHostProvider(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "featurea") {
        composable("featurea") {
            FeatureAScreen(
                onButtonClick = {
                    navController.navigate(Screens.FeatureZ.route)
                }
            )
        }

        composable(
            Screens.FeatureZ.route,
            ) {
            FeatureZScreen()
        }
    }
}