package com.example.androiduidevelopment.que_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueSeventeenBinding

class QueSeventeenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueSeventeenBinding
    private var country= arrayListOf("Select country","INDIA","USA","CANADA","CHINA","JAPAN","SOUTH KOREA","DENMARK","ITALY","FINLAND","SWITZERLAND","NORWAY","RUSSIA","UAE","AUSTRALIA")
    private lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueSeventeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,country)
        binding.spinner.adapter = adapter

    }
}