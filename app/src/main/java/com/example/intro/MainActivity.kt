package com.example.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ZoomButtonsController

class MainActivity : AppCompatActivity() {
    lateinit var ButtonSTART: Button
    lateinit var ButtonSIGN_UP:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonSTART=findViewById(R.id.button)
        ButtonSIGN_UP=findViewById(R.id.button3)
        ButtonSTART.setOnClickListener {
            val intent= Intent(this,VoicerecorderActivity::class.java)
            startActivity(intent)

            ButtonSIGN_UP.setOnClickListener {
                val intent=Intent(this,SignUpActivity::class.java)
                startActivity(intent)
        }
    }
}

    }

