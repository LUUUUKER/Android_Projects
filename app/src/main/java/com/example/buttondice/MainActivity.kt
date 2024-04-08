package com.example.buttondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button_roll)
        val resultTextView: TextView = findViewById(R.id.textView_result)

        rollButton.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7) // Dice has numbers 1-6
            resultTextView.text = randomNumber.toString()
        }
    }
}
