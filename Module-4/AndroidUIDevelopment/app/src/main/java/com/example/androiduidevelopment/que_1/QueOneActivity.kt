package com.example.androiduidevelopment.que_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueOneBinding

class QueOneActivity : AppCompatActivity() {
    private lateinit var binding : ActivityQueOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etNumber.addTextChangedListener {
            var number = if(binding.etNumber.text.toString().isNotBlank()) binding.etNumber.text.toString().trim() else "0"

            binding.tvReverseNumber.text = number.reversed()
        }

    }
}