package com.example.featurea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.featurea.ui.main.FeatureAFragment

//todo: delete this or do we need activity for deep links?
class FeatureA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_featurea)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FeatureAFragment.newInstance())
                .commitNow()
        }
    }
}