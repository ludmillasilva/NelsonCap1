package com.ludmilla.nelsoncap1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Build
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.buttonToast)
*/


        buttonToast.setOnClickListener {
            val text = editText.text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}