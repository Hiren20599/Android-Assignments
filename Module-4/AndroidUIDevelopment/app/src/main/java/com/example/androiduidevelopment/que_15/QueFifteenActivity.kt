package com.example.androiduidevelopment.que_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.core.content.ContextCompat
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueFifteenBinding

class QueFifteenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueFifteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQueFifteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { radioGroup, id ->

            when(id){
                R.id.rb_red -> binding.layoutFifteen.setBackgroundResource(R.color.RED)
                R.id.rb_yellow -> binding.layoutFifteen.setBackgroundResource(R.color.YELLOW)
                R.id.rb_green -> binding.layoutFifteen.setBackgroundResource(R.color.GREEN)
                R.id.rb_blue -> binding.layoutFifteen.setBackgroundResource(R.color.BLUE)
            }
        }
    }
}