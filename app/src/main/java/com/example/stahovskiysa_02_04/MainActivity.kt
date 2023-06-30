package com.example.stahovskiysa_02_04

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.coroutines.coroutineContext

private lateinit var Open:Button
private lateinit var Login:EditText
private lateinit var Password:EditText
lateinit var sharedPref:SharedPreferences
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Open.findViewById<Button>(R.id.btn1)
        Login.findViewById<EditText>(R.id.login)
        Password.findViewById<EditText>(R.id.password)
        sharedPref=getSharedPreferences("ACCAUNT", MODE_PRIVATE)

        if(sharedPref.contains("LOGIN")&& sharedPref.contains("PASSWORD")){
            var log= sharedPref.getString("LOGIN","NONE")
            var pass= sharedPref.getString("PASSWORD","NONE")
        }



    }
}