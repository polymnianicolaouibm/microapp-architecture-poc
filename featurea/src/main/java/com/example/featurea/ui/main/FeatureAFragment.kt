package com.example.featurea.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.featurea.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FeatureAFragment : Fragment() {

    companion object {
        fun newInstance() = FeatureAFragment()
    }

    private lateinit var viewModel: FeatureAViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeatureAViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val v: View = inflater.inflate(R.layout.fragment_featurea, container, false)
        val bt: MaterialButton = v.findViewById(R.id.button)
        bt.setOnClickListener(View.OnClickListener {
            // todo:nget navcontroller?
            //viewModel.onFeatureAButtonClick()
        })
        return v
    }

}