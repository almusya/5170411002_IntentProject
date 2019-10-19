package com.example.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nim = findViewById<EditText>(R.id.Nim)
        val nama= findViewById<EditText>(R.id.Nama)
        val nilai=findViewById<EditText>(R.id.Nilai)

        val save=findViewById<Button>(R.id.button)

        save.setOnClickListener {
            val nims = nim.text.toString()
            val name = nama.text.toString()
            val value : Int = Integer.parseInt(nilai.text.toString())

        if ((Nim.text.isEmpty())||Nama.text.isEmpty()||Nilai.text.isEmpty()){
                toast("Data tidak Boleh Kosong", Toast.LENGTH_LONG)
            }
        else{
            val intent =  Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("nim", nims)
            intent.putExtra("nama", name)
            intent.putExtra("nilai", value)

            startActivity(intent)

        }
    }
    }
    private fun toast(pesan: String, length: Int=Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan ,length).show()

    }
}
