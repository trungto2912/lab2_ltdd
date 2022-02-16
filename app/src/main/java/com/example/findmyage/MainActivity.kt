package com.example.findmyage

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butGetAge: Button = findViewById(R.id.butGetAge)
        val etDOB: EditText = findViewById(R.id.etDOB)
        val textShowAge: TextView = findViewById(R.id.textShowAge)
        butGetAge.setOnClickListener {
            val userDOB: Int = Integer.parseInt(etDOB.text.toString())
            val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears = currentYear - userDOB

            textShowAge.text = "Your Age is $userAgeInYears Years"
            Log.d("LogsMe", "Your Age is $userAgeInYears Years")
        }


    }
}