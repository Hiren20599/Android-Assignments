package com.example.androiduidevelopment.que_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueThirteenBinding

class QueThirteenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueThirteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cbShow.setOnCheckedChangeListener { compoundButton , isChecked ->

            if (!isChecked){
                binding.tvName.visibility = View.GONE
            }
            else{
                binding.tvName.visibility = View.VISIBLE
            }
        }
    }
}