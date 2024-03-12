package com.example.featurea.ui.main

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.featurea.R

class FeatureAViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    fun onFeatureAButtonClick(navController: NavController){
        navController.navigate(R.id.action_feature_a_fragment_to_feature_b_fragment)
    }
}