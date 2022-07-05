package com.example.konversinilai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mengisi variabel dari komponen pd xml
        val nilai: EditText = findViewById(R.id.etNilai)
        val btnHasil: Button = findViewById(R.id.btnHasil)



        btnHasil.setOnClickListener {
            if (nilai.text.toString().toInt() >= 81) {
                Toast.makeText(this, "A", Toast.LENGTH_LONG).show()
            } else if (nilai.text.toString().toInt() <= 80 && nilai.text.toString().toInt() >= 61) {
                Toast.makeText(this, "B", Toast.LENGTH_LONG).show()
            } else if (nilai.text.toString().toInt() <= 60 && nilai.text.toString().toInt() >= 41) {
                Toast.makeText(this, "C", Toast.LENGTH_LONG).show()
            } else if (nilai.text.toString().toInt() <= 40 && nilai.text.toString().toInt() >= 21) {
                Toast.makeText(this, "D", Toast.LENGTH_LONG).show()
            } else if (nilai.text.toString().toInt() <= 21) {
                Toast.makeText(this, "E", Toast.LENGTH_LONG).show()
            }
        }
    }
}