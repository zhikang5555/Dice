package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dice.R
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rB: Button = this.findViewById(R.id.roll_button)
        rB.setOnClickListener { rollDice() }
        val cB: Button= this.findViewById(R.id.count_button)
        cB.setOnClickListener{countDice()}
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = ""
        resultText1.text = ""
        resultText2.text = ""

        val randomInt = Random().nextInt(6)+ 1
        resultText.text = randomInt.toString()
        val randomInt1 = Random().nextInt(6)+ 1
        resultText1.text = randomInt1.toString()
        val randomInt2 = Random().nextInt(6)+ 1
        resultText2.text = randomInt2.toString()
    }
    private fun countDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        var rt = resultText.getText().toString()
        var rt1 = resultText1.getText().toString()
        var rt2 = resultText2.getText().toString()
        var d1 = rt.toInt()
        var d2 = rt1.toInt()
        var d3 = rt2.toInt()


        d1++
        if(d1<=6)
            resultText.text = d1.toString()
        else
            resultText.text = "6"


        d2++
        if(d2<=6)
            resultText1.text = d2.toString()
        else
            resultText1.text = "6"


        d3 ++
        if(d3<=6)
            resultText2.text = d3.toString()
        else
            resultText2.text = "6"


    }
}
