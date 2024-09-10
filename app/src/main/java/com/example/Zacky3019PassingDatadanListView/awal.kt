package com.example.Zacky3019PassingDatadanListView

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class awal : AppCompatActivity() {

    private lateinit var log_in : Button
    private lateinit var listhewan : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awal)

        log_in= findViewById(R.id.button)
        listhewan= findViewById(R.id.hewanlist)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        log_in.setOnClickListener(){
            val arya = Intent(this, login_screen::class.java)
            arya.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(arya)
        }

        listhewan.setOnClickListener(){
            val arya = Intent(this, list::class.java)
            arya.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(arya)
        }
    }
}