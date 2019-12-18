package com.example.myapplication1

import android.R.id.button3
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn1 = findViewById<Button>(R.id.button1)
        val myBtn2 = findViewById<Button>(R.id.button2)
        val myBtn3 = findViewById<Button>(R.id.button3)
        val myBtn4 = findViewById<Button>(R.id.button4)
        val myBtn5 = findViewById<Button>(R.id.button5)
        myBtn1.setOnClickListener{
            setContentView(R.layout.layout_1)
        }
        myBtn2.setOnClickListener{
            setContentView(R.layout.layout_2)
        }
        myBtn3.setOnClickListener{
            setContentView(R.layout.layout_3)
        }
        myBtn4.setOnClickListener{
            setContentView(R.layout.layout_4)
        }
        myBtn5.setOnClickListener{
            setContentView(R.layout.layout_5)
        }
    }


}
