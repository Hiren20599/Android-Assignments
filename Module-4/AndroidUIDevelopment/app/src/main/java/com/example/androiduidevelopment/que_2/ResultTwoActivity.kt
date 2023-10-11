package com.example.androiduidevelopment.que_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityResultTwoBinding

class ResultTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstNumber = intent.getIntExtra("FirstNumber",0)
        var secondNumber = intent.getIntExtra("SecondNumber",0)

        binding.tvResult.text = "All the numbers between $firstNumber and $secondNumber are:-"

        var numbersList = calculateNumbersBetween(firstNumber,secondNumber)
        var numberString = numbersList.joinToString(" , ")

        binding.tvBetweenNumbers.text = numberString
    }

    private fun calculateNumbersBetween(firstNumber: Int, secondNumber: Int):List<Int> {
        var numbersList = mutableListOf<Int>()

        for(i in firstNumber+1 until secondNumber){
            numbersList.add(i)
        }
        return numbersList
    }

}