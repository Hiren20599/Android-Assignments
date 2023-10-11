package com.example.androiduidevelopment.que_16

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.androiduidevelopment.R
import com.example.androiduidevelopment.databinding.ActivityQueSixteenBinding

class QueSixteenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQueSixteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueSixteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sbRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var red = progress
                var green = 0
                var blue = 255 - progress
                var backGroundColor = Color.rgb(red, green, blue)

                binding.layout.setBackgroundColor(backGroundColor)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        binding.sbBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var blue = progress
                var red = 0
                var green = 255 - progress


                var backGroundColor = Color.rgb(red, green, blue)

                binding.layout.setBackgroundColor(backGroundColor)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        binding.sbGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var green = progress
                var blue = 0
                var red = 255 - progress
                var backGroundColor = Color.rgb(red, green, blue)

                binding.layout.setBackgroundColor(backGroundColor)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

    }
}