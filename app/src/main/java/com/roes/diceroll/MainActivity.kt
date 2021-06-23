package com.roes.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dice1 = 0
    var dice2 = 0
    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.btn_Roll)

        val btnClear: Button = findViewById(R.id.buttonClear)
        
        rollbutton.setOnClickListener(){
            dice1 = RandomDice(dice1)
            dice2 = RandomDice(dice2)

            ShowDice()
        }


        btnClear.setOnClickListener(){
            dice1 = 0
            dice2 = 0
            ShowDice()
        }

    }



    private fun RandomDice(a: Int): Int {
        return (1..6).random()
    }

    private fun ShowDice() {
        diceImage = findViewById(R.id.DiceImageOne)
        diceImage2 = findViewById(R.id.DiceImageTwo)
        val drawableResource = when (dice1) {
            0 -> R.drawable.empty_dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (dice2) {
            0 -> R.drawable.empty_dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
    }

}
