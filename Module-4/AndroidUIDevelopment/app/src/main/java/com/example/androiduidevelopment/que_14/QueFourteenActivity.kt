package com.example.androiduidevelopment.que_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueFourteenBinding

class QueFourteenActivity : AppCompatActivity() {
    private lateinit var binding : ActivityQueFourteenBinding
    private lateinit var cityAdapter : ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueFourteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myArray = resources.getStringArray(R.array.CityList)

        cityAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myArray)
        binding.listView.adapter = cityAdapter

        binding.listView.setOnItemClickListener { adapterView, view, position, id ->

            var city = myArray[position]
            Toast.makeText(this, "$city", Toast.LENGTH_SHORT).show()
        }
    }
}