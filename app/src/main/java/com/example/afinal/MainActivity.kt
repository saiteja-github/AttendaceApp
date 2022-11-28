package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var id: EditText
    private lateinit var password: EditText
    private lateinit var loginbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin= findViewById<Button>(R.id.loginbtn)
        btnlogin.setOnClickListener {
            val intent = Intent(this@MainActivity, afterlogin::class.java)
            startActivity(intent)
        }
    }
}