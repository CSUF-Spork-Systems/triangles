package com.example.sporktriangle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//  Initialize variables for user to input text
    private lateinit var inputLength1: EditText
    private lateinit var inputLength2: EditText
    private lateinit var inputLength3: EditText
    private lateinit var button: Button
    private lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       Maps variables to editText/input fields
        inputLength1 = findViewById(R.id.editTextNumber)
        inputLength2 = findViewById(R.id.editTextNumber2)
        inputLength3 = findViewById(R.id.editTextNumber3)
        val textAnswer = findViewById<TextView>(R.id.textViewAnswer)

        button = findViewById(R.id.goButton)
        button2 = findViewById(R.id.exitBtn)

//       Takes in user input values on button click and turns them into integers
        button.setOnClickListener {
            if ((!inputLength1.text.isNullOrBlank())&&(!inputLength2.text.isNullOrBlank())&&(!inputLength3.text.isNullOrBlank())) {
                val length1 = inputLength1.text.toString().toInt()
                val length2 = inputLength2.text.toString().toInt()
                val length3 = inputLength3.text.toString().toInt()

//          Variables to set minimum and maximum range that app will accept.
                val minRange = 1
                val maxRange = 100

//          Form validation for when user inputs something that is not within the range of 1-100
                if (length1 < minRange || length1 > maxRange) {
                    Toast.makeText(this, "First Length should range from 1- 100", Toast.LENGTH_SHORT).show()
                } else if (length2 < minRange || length2 > maxRange) {
                    Toast.makeText(this, "Second Length should range from 1- 100", Toast.LENGTH_SHORT).show()
                } else if (length3 < minRange || length3 > 100) {
                    Toast.makeText(this, "Third Length should range from 1- 100", Toast.LENGTH_SHORT).show()
                } else { // Run the algorithm
                    val resId = when (check_triangle(length1, length2, length3)) {
                        "Equilateral" -> R.string.equilateral
                        "Isosceles" -> R.string.isosceles
                        "Scalene" -> R.string.scalene
                        else -> R.string.not_a_triangle
                    }
                    textAnswer.setText(resId)
                }
            }
                else{
                Toast.makeText(this, "Fill in All inputs", Toast.LENGTH_LONG).show()
            }
        }

        button2.setOnClickListener{
            startActivity(Intent(this@MainActivity, EndActivity2::class.java))

        }
    }

}