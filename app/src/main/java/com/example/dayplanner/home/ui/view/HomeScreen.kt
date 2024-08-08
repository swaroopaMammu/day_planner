package com.example.dayplanner.home.ui.view

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.dayplanner.home.ui.viewmodel.HomeScreenViewModel
import com.example.dayplanner.R
import com.example.dayplanner.databinding.FragmentHomeScreenBinding
import com.example.dayplanner.home.ui.adapter.HomeGridAdapter

class HomeScreen : Fragment() {

    private lateinit var binding :FragmentHomeScreenBinding

    companion object {
        fun newInstance() = HomeScreen()
    }

    private val viewModel: HomeScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home_screen,container,false)
        val categoryList: ArrayList<String> = arrayListOf("Day","Routine","Solo Trip","Weekend")
        val adapter = HomeGridAdapter(requireContext(),categoryList)
        binding.gridview.adapter = adapter
        return binding.root
    }
}