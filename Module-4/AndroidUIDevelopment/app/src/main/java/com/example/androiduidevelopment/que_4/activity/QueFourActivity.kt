package com.example.androiduidevelopment.que_4.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueFourBinding
import com.example.androiduidevelopment.que_4.fragment.LoginFragment
import com.example.androiduidevelopment.que_4.fragment.RegistrationFragment

class QueFourActivity : AppCompatActivity(){
    private lateinit var binding: ActivityQueFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQueFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            setFragment(LoginFragment())
        }

        binding.btnRegistration.setOnClickListener {
            setFragment(RegistrationFragment())
        }
    }

    private fun setFragment(fragment: Fragment) {
        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}