package com.example.navigation

import android.net.Uri
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

interface Navigator{
    var navHostFragment: NavHostFragment
    var navController: NavController
    fun navigateTo(destination: Int)
    fun navigateTo(uri: Uri)
}