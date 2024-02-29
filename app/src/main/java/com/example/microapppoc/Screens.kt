package com.example.microapppoc

sealed class Screens(val route : String) {
    object FeatureA : Screens("featurea")
    object FeatureZ : Screens("featurez")
}