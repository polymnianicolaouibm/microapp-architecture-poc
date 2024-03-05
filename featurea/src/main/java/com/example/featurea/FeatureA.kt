package com.example.featurea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.featurea.ui.main.FeatureFragment

class FeatureA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_featurea)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FeatureFragment.newInstance())
                .commitNow()
        }
    }
}