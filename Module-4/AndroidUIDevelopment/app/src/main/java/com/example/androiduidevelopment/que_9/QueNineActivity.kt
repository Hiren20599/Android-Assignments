package com.example.androiduidevelopment.que_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueNineBinding

class QueNineActivity : AppCompatActivity() {
    private lateinit var binding : ActivityQueNineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter.setOnClickListener {

            var name = binding.etName.text.toString().trim()
            var email = binding.etEmail.text.toString().trim()
            var contact = binding.etContact.text.toString().trim()
            var address = binding.etAddress.text.toString().trim()
            var course = binding.etCourse.text.toString().trim()
            var dob = binding.etDob.text.toString().trim()


            var intent = Intent(this, TableLayoutActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("CONTACT", contact)
            intent.putExtra("ADDRESS", address)
            intent.putExtra("COURSE", course)
            intent.putExtra("DOB", dob)
            startActivity(intent)
        }
    }
}