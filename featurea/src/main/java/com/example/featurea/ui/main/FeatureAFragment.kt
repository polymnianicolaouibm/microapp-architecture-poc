package com.example.featurea.ui.main

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.featurea.R
import com.example.featurea.databinding.FragmentFeatureaBinding
import com.example.navigation.Navigator


class FeatureAFragment : Fragment() {

    private lateinit var viewModel: FeatureAViewModel
    private lateinit var binding: FragmentFeatureaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeatureAViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFeatureaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        //navigate to Fragment Asub in same Feature A Module
        binding.buttonToFeatureAsub.setOnClickListener {
             (requireActivity() as Navigator).navigateTo(R.id.feature_a_sub_fragment)

        }
        //navigate to Fragment Z in Feature Z Module  via deeplink
        binding.buttonToFeatureZ.setOnClickListener{
             (requireActivity() as Navigator).navigateTo(Uri.parse("myapp://featurezfragment"))
        }
    }

}