package com.vixonnen.myapplication.screens.image

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vixonnen.myapplication.R
import com.vixonnen.myapplication.databinding.ImageFragmentBinding

class ImageFragment : Fragment() {

    private lateinit var mViewModel: ImageViewModel
    private var binding :ImageFragmentBinding? = null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ImageFragmentBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(ImageViewModel::class.java)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}