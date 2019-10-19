package com.example.intentproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val value = intent.getIntExtra("nilai",100)
        val ket:String

        if (value >=80){
            ket="A"
        }
        else if (value >=60){
            ket="B"
        }
        else if (value >=40){
            ket="C"
        }
        else if (value >=20){
            ket="D"
        }
        else {
            ket="E"
        }

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM      : " + nim+"\nNama   :" + nama+"\nNilai      :" +value+"\nKeterangan :"+ ket

    }
}