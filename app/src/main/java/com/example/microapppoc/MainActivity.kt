package com.example.microapppoc


import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigation.Navigator
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), Navigator {
    override lateinit var navHostFragment: NavHostFragment
    override lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        findViewById<BottomNavigationView>(R.id.bottom_navigation)
            .setupWithNavController(navController)
    }

    override fun navigateTo(destination: Int) {
        //Using fragmentId
        navController.navigate(destination)
    }

    override fun navigateTo(uri: Uri) {
        //Using uri directly
        //navController.navigate(uri)
        //or using deeplink
        val request = NavDeepLinkRequest.Builder
            .fromUri(uri)
            .build()
        navController.navigate(request)

    }

}
