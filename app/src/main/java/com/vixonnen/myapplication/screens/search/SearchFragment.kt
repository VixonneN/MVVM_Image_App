package com.vixonnen.myapplication.screens.search

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vixonnen.myapplication.R
import com.vixonnen.myapplication.databinding.ImageFragmentBinding
import com.vixonnen.myapplication.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {

    private var binding : SearchFragmentBinding? = null
    private val mBinding get() = binding!!
    private lateinit var viewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SearchFragmentBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}