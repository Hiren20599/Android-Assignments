package com.example.androiduidevelopment.que_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueElevenBinding

class QueElevenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueElevenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueElevenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var txtSize = 14f

        binding.ivDecrease.setOnClickListener {
            txtSize--
            binding.etFontSize.textSize = txtSize

        }
        binding.ivIncrease.setOnClickListener {
            txtSize++
            binding.etFontSize.textSize = txtSize
        }
    }
}