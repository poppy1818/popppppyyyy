package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isFirstPlayer = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        reset()
    }


    private fun reset() {
        reset.setOnClickListener {
            recreate()
        }
    }

    private fun init() {
        button00.setOnClickListener {
            checkPlayer(button00)
        }

        button01.setOnClickListener {
            checkPlayer(button01)
        }

        button02.setOnClickListener {
            checkPlayer(button02)
        }

        button10.setOnClickListener {
            checkPlayer(button10)
        }

        button11.setOnClickListener {
            checkPlayer(button11)
        }

        button12.setOnClickListener {
            checkPlayer(button12)
        }

        button20.setOnClickListener {
            checkPlayer(button20)
        }

        button21.setOnClickListener {
            checkPlayer(button21)
        }

        button22.setOnClickListener {
            checkPlayer(button22)
        }
    }

    private fun win(button: Button) {
        button00.isClickable = false
        button01.isClickable = false
        button02.isClickable = false
        button10.isClickable = false
        button11.isClickable = false
        button12.isClickable = false
        button20.isClickable = false
        button21.isClickable = false
        button22.isClickable = false
    }


    private fun checkPlayer(button: Button) {
        if (isFirstPlayer) {
            if (button.text.isEmpty()) {
                button.text = "X"
                isFirstPlayer = false
            }

        } else {
            button.text = "0"
            isFirstPlayer = true
        }
        if (button00.text.isNotEmpty() && button00.text == button01.text && button00.text == button02.text) {
            Toast.makeText(this, "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()
            win(button00)
        } else if (button10.text.isNotEmpty() && button10.text == button11.text && button10.text == button12.text) {
            Toast.makeText(this, "Winner is ${button10.text}", Toast.LENGTH_SHORT).show()
            win(button10)
        } else if (button20.text.isNotEmpty() && button20.text == button21.text && button20.text == button22.text) {
            Toast.makeText(this, "Winner is ${button20.text}", Toast.LENGTH_SHORT).show()
            win(button20)
        } else if (button01.text.isNotEmpty() && button01.text == button11.text && button01.text == button22.text) {
            Toast.makeText(this, "Winner is ${button01.text}", Toast.LENGTH_SHORT).show()
            win(button01)
        } else if (button00.text.isNotEmpty() && button00.text == button10.text && button00.text == button20.text) {
            Toast.makeText(this, "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()
            win(button00)
        } else if (button02.text.isNotEmpty() && button02.text == button12.text && button01.text == button22.text) {
            Toast.makeText(this, "Winner is ${button02.text}", Toast.LENGTH_SHORT).show()
            win(button02)
        } else if (button00.text.isNotEmpty() && button00.text == button11.text && button00.text == button22.text) {
            Toast.makeText(this, "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()
            win(button00)

        } else if (button02.text.isNotEmpty() && button02.text == button11.text && button02.text == button20.text) {
            Toast.makeText(this, "Winner is ${button02.text}", Toast.LENGTH_SHORT).show()
            win(button02)

        } else if (button00.text.isNotEmpty() && button01.text.isNotEmpty() && button02.text.isNotEmpty() && button10.text.isNotEmpty() && button11.text.isNotEmpty() && button12.text.isNotEmpty() && button20.text.isNotEmpty() && button21.text.isNotEmpty() && button22.text.isNotEmpty()) {

            Toast.makeText(this, "You Tied!", Toast.LENGTH_SHORT).show()
        }

    }

}










