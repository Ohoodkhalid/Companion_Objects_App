package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var layout:ConstraintLayout
    lateinit var setBackGround :Button
    lateinit var  editT : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout = findViewById(R.id.layout)
        setBackGround = findViewById(R.id.changeBu)
        editT = findViewById(R.id.editT)

        setBackGround.setOnClickListener {
            var dayOrNight = editT.text.toString()
            if (dayOrNight.isNotEmpty()) {
                Log.d("FOUND","$dayOrNight")

                BackGround.Change(dayOrNight,layout)


            }


        }
    }

    }
