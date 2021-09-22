package com.example.sporktriangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

//  Initialize variables for user to input text
    lateinit var inputLength1: EditText
    lateinit var inputLength2: EditText
    lateinit var inputLength3: EditText
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       Maps variables to editText/input fields
        inputLength1 = findViewById(R.id.editTextNumber)
        inputLength2 = findViewById(R.id.editTextNumber2)
        inputLength3 = findViewById(R.id.editTextNumber3)

        button = findViewById(R.id.goButton)

//       Takes in user input values on button click and turns them into integers
        button.setOnClickListener{
            var length1 = inputLength1.text.toString().toInt()
            var length2 = inputLength2.text.toString().toInt()
            var length3 = inputLength3.text.toString().toInt()

//          Variables to set minium and maximum range that app will accept.
            var minRange = 1;
            var maxRange = 100;

//          Form validation for when user inputs something that is not within the range of 1-100
                if (length1 < minRange || length1 > maxRange) {
                    inputLength1.setError("Please enter a number between 1-100");
                    inputLength1.requestFocus();
                }
                else if (length2 < minRange || length2 > maxRange) {
                    inputLength2.setError("Please enter a number between 1-100");
                    inputLength2.requestFocus();
                }
                else if (length3 < minRange || length3 > 100) {
                    inputLength3.setError("Please enter a number between 1-100");
                    inputLength3.requestFocus();
                }

        }



    }


}