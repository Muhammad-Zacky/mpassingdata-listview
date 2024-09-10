package com.example.Zacky3019PassingDatadanListView

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login_screen : AppCompatActivity() {

    private lateinit var inputnama :EditText
    private lateinit var inputpassword : EditText
    private lateinit var tombol : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        inputnama =findViewById(R.id.inputnama)
        inputpassword =findViewById(R.id.inputpassword)
        tombol =findViewById(R.id.tombol)

        tombol.setOnClickListener(){
            val intent = Intent(this@login_screen , MainActivity ::class.java)
            val inputnama = inputnama.text.toString()
            val inputpassword = inputpassword.text.toString()

            intent.putExtra("username", inputnama)
            intent.putExtra("password",inputpassword)
            Log.d("username",inputnama)
            Log.d("password",inputpassword)
            startActivity(intent)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}