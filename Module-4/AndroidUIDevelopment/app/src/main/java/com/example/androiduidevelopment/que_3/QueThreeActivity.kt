package com.example.androiduidevelopment.que_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueThreeBinding

class QueThreeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { radioGroup, id ->

            var firstNumber = if (binding.etFirstNumber.text.toString().isNotBlank()) binding.etFirstNumber.text.toString().toInt() else 0
            var secondNumber = if (binding.etSecondNumber.text.toString().isNotBlank()) binding.etSecondNumber.text.toString().toInt() else 0

            when (id) {
                R.id.rb_addition -> binding.tvAnswer.text =
                    "$firstNumber + $secondNumber = ${firstNumber.plus(secondNumber)}"

                R.id.rb_subtraction -> binding.tvAnswer.text =
                    "$firstNumber - $secondNumber = ${firstNumber.minus(secondNumber)}"

                R.id.rb_multiplication -> binding.tvAnswer.text =
                    "$firstNumber * $secondNumber = ${firstNumber.times(secondNumber)}"

                R.id.rb_division -> { binding.tvAnswer.text =
                    if (secondNumber==0) "Enter valid input"
                    else  "$firstNumber / $secondNumber = ${firstNumber.toDouble().div(secondNumber.toDouble())}"
                }
                else -> "Enter valid inputs"
            }

        }
    }
}