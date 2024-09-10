package com.example.Zacky3019PassingDatadanListView

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtwelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtwelcome = findViewById(R.id.textView)

        // Mengambil data dari Intent
        val inputNama = intent.getStringExtra("username")
        val inputPassword = intent.getStringExtra("password")

        // Mengatur teks pada TextView
        txtwelcome.text = "Hello $inputNama! Password Anda $inputPassword"

        // Menambahkan padding sesuai dengan system bars (opsional)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
