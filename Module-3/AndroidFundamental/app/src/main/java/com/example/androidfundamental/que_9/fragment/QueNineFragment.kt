package com.example.androidfundamental.que_9.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.androidfundamental.databinding.FragmentQueNineBinding
import com.example.androidfundamental.que_9.activity.QueNineActivity


class QueNineFragment : Fragment() {
    private lateinit var btnActivity : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentQueNineBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        binding.btnGoToActivity.setOnClickListener {
                var intent = Intent(context, QueNineActivity::class.java)
                startActivity(intent)
            }
        return binding.root
    }



}
