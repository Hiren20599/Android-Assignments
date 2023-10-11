package com.example.androiduidevelopment.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androiduidevelopment.databinding.QuestionListLayoutBinding
import com.example.androiduidevelopment.model.Question
import com.example.androiduidevelopment.que_1.QueOneActivity
import com.example.androiduidevelopment.que_10.QueTenActivity
import com.example.androiduidevelopment.que_11.QueElevenActivity
import com.example.androiduidevelopment.que_12.QueTwelveActivity
import com.example.androiduidevelopment.que_13.QueThirteenActivity
import com.example.androiduidevelopment.que_14.QueFourteenActivity
import com.example.androiduidevelopment.que_15.QueFifteenActivity
import com.example.androiduidevelopment.que_16.QueSixteenActivity
import com.example.androiduidevelopment.que_17.QueSeventeenActivity
import com.example.androiduidevelopment.que_2.QueTwoActivity
import com.example.androiduidevelopment.que_3.QueThreeActivity
import com.example.androiduidevelopment.que_4.activity.QueFourActivity
import com.example.androiduidevelopment.que_8.QueEightActivity
import com.example.androiduidevelopment.que_9.QueNineActivity

class QuestionListAdapter(var context: Context, var questionList : MutableList<Question>) : Adapter<QuestionListAdapter.MyViewHolder>() {

    class MyViewHolder(var binding: QuestionListLayoutBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = QuestionListLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var question  = questionList[position]
        holder.binding.tvQuestion.text = question.question

        holder.binding.cardQuestionLayout.setOnClickListener {
            when(question.id){
                1 -> context.startActivity(Intent(context,QueOneActivity::class.java))
                2 -> context.startActivity(Intent(context,QueTwoActivity::class.java))
                3 -> context.startActivity(Intent(context,QueThreeActivity::class.java))
                4 -> context.startActivity(Intent(context,QueFourActivity::class.java))
                5,6,7 -> {
                    Toast.makeText(context, "To be taught later", Toast.LENGTH_SHORT).show()
                }
                8 -> context.startActivity(Intent(context,QueEightActivity::class.java))
                9 -> context.startActivity(Intent(context,QueNineActivity::class.java))
                10 -> context.startActivity(Intent(context,QueTenActivity::class.java))
                11 -> context.startActivity(Intent(context,QueElevenActivity::class.java))
                12 -> context.startActivity(Intent(context,QueTwelveActivity::class.java))
                13 -> context.startActivity(Intent(context,QueThirteenActivity::class.java))
                14 -> context.startActivity(Intent(context,QueFourteenActivity::class.java))
                15 -> context.startActivity(Intent(context,QueFifteenActivity::class.java))
                16 -> context.startActivity(Intent(context,QueSixteenActivity::class.java))
                17 -> context.startActivity(Intent(context,QueSeventeenActivity::class.java))
            }
        }
    }
}