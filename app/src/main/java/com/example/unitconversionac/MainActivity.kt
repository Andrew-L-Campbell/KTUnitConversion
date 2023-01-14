package com.example.unitconversionac
/*
Andrew Campbell
Unit Conversion
Converting Between Peruvian Soles to American Dollars
1 SOL = .25670 Dollars
1 Dollar = 3.89560 Soles
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    lateinit var ToDollarsBtn: Button
    lateinit var ToSolesBtn: Button
    lateinit var EditTextNumber: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToDollarsBtn = findViewById(R.id.toDollarsBtn)//setting button
        ToDollarsBtn.setOnClickListener({solesToDollars(EditTextNumber)})//setting listener when clicked


        ToSolesBtn = findViewById(R.id.toSolesBtn)
        ToSolesBtn.setOnClickListener({DollarsToSoles(EditTextNumber)})

        EditTextNumber = findViewById(R.id.editTextNumber)

    }

    fun solesToDollars(editTextNumber: TextView){
        if(editTextNumber.text.toString().trim().isNotEmpty() ||//if no input run rest
            editTextNumber.text.toString().trim().isNotBlank()){
            var newNumber = (editTextNumber.text.toString().toFloat() * .25670)//getting input and changing to float plus conversion
            editTextNumber.text = String.format("%.4f",newNumber)//changing text to new calculated float
        }

    }
    fun DollarsToSoles(editTextNumber: TextView){
        if(editTextNumber.text.toString().trim().isNotEmpty() ||
            editTextNumber.text.toString().trim().isNotBlank()) {
            var newNumber = (editTextNumber.text.toString().toFloat() * 3.89560)
            editTextNumber.text = String.format("%.4f",newNumber)
        }
    }
}