package com.example.utskalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun kali (view: View){
        val input1 : EditText =findViewById(R.id.input1)
        val input2 : EditText =findViewById(R.id.input2)
        val hasil : TextView =findViewById(R.id.hasil)
        hasil.text = (input1.text.toString().toInt() * input2.text.toString().toInt()).toString()
    }
    fun tambah (view: View){
        val input1 : EditText =findViewById(R.id.input1)
        val input2 : EditText =findViewById(R.id.input2)
        val hasil : TextView =findViewById(R.id.hasil)
        hasil.text = (input1.text.toString().toInt() + input2.text.toString().toInt()).toString()
    }
    fun kurang (view: View){
        val input1 : EditText =findViewById(R.id.input1)
        val input2 : EditText =findViewById(R.id.input2)
        val hasil : TextView =findViewById(R.id.hasil)
        hasil.text = (input1.text.toString().toInt() - input2.text.toString().toInt()).toString()
    }
    fun bagi (view: View){
        val input1 : EditText =findViewById(R.id.input1)
        val input2 : EditText =findViewById(R.id.input2)
        val hasil : TextView =findViewById(R.id.hasil)
        hasil.text = (input1.text.toString().toInt() / input2.text.toString().toInt()).toString()
    }
}
