package com.example.androiduidevelopment.que_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.transition.Visibility
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueEightBinding

class QueEightActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueEightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueEightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHide.setOnClickListener {
            binding.tvHello.visibility = View.GONE
        }

        binding.btnShow.setOnClickListener {
            binding.tvHello.visibility = View.VISIBLE
        }
    }
}