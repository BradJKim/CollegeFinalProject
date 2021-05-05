package com.example.collegefinalproject.mainMenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.collegefinalproject.R


class MainMenuActivity : AppCompatActivity() {

    companion object{
     val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}