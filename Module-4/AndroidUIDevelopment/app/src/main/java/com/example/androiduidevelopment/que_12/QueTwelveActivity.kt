package com.example.androiduidevelopment.que_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueTwelveBinding

class QueTwelveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueTwelveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreate.setOnClickListener {
            val number = binding.etNumber.text.toString().toIntOrNull()
            if (number != null && number > 0) {
                binding.linearLayout.removeAllViews()
                for (i in 1..number) {
                    val editText = EditText(this)
                    editText.hint = "EditText $i"
                    binding.linearLayout.addView(editText)
                }
            } else {
                binding.etNumber.error = "Please enter a valid number"
            }
        }
    }

}

