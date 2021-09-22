package com.example.sporktriangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var editText: EditText
    lateinit var editText2: EditText
    lateinit var editText3: EditText
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextNumber)
        editText2 = findViewById(R.id.editTextNumber2)
        editText3 = findViewById(R.id.editTextNumber3)

        button = findViewById(R.id.goButton)

        button.setOnClickListener{
            var length1 = editText.text.toString().toInt()
            var length2 = editText2.text
            var length3 = editText3.text

            if(length1 < 1 || length1 >100){
                println("hello")
            }

        }



    }
}