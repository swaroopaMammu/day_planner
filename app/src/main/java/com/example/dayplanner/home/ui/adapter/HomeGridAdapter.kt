package com.example.dayplanner.home.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.example.dayplanner.R
import com.example.dayplanner.databinding.GridCardLayoutBinding


class HomeGridAdapter(val context: Context, val list: ArrayList<String>):
    BaseAdapter()  {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var binding : GridCardLayoutBinding
        if (convertView == null) {
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.grid_card_layout,
                parent,
                false
            )
        } else {
            binding = DataBindingUtil.getBinding(convertView)!!
        }
       binding.content = list[position]

        return binding.root
    }



}
