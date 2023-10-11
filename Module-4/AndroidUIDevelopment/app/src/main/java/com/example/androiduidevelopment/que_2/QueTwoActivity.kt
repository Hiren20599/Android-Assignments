package com.example.androiduidevelopment.que_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueTwoBinding

class QueTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQueTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var firstNumber = binding.etFirstNumber.text.toString().toInt()
            var secondNumber = binding.etSecondNumber.text.toString().toInt()

            var intent = Intent(this,ResultTwoActivity::class.java)

            intent.putExtra("FirstNumber",firstNumber)
            intent.putExtra("SecondNumber",secondNumber)

            startActivity(intent)
        }
    }
}