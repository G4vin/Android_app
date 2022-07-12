package com.example.gavcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc: Button ?= null
    var ButtonInt: Button ?= null
    var ButtonWeb: Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonCalc = findViewById(R.id.btn_calc)

        ButtonCalc!!.setOnClickListener {
            val intent = Intent(this,Calculator::class.java)
            startActivity(intent)
        }

        ButtonInt = findViewById(R.id.btn_intent)
        ButtonInt!!.setOnClickListener {
            val intent = Intent(this,activity_intent::class.java)
            startActivity(intent)
        }

        ButtonWeb = findViewById(R.id.btn_web)
        ButtonWeb!!.setOnClickListener {
            val intent = Intent(this,Webactivity::class.java)
            startActivity(intent)
        }
    }
}