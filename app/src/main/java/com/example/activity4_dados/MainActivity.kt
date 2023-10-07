package com.example.activity4_dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLanzar: Button = findViewById(R.id.btnLanzar)


        btnLanzar.setOnClickListener {
           tiempo()
            //Toast.makeText(this,"Hola a Todos", Toast.LENGTH_LONG).show()


        }
            rollDice()
    }

    private fun rollDice() {
        var numero: Int = Lanzar(6)

        //Toast.makeText(this,"El numero al azar es:"+ numero, Toast.LENGTH_LONG).show()


        val drawableResultado = when (numero) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        val Dice: ImageView = findViewById(R.id.Dice)
        Dice.setImageResource(drawableResultado)
    }


    private fun Lanzar(max: Int): Int {
        return (1..max).random()

    }

    private fun tiempo() {
        object: CountDownTimer(3000, 200){
            override fun onTick(p0: Long) {
                rollDice()
            }

            override fun onFinish() {

            }

        }.start()
    }

}