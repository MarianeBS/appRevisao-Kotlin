package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnButton: Button = findViewById(R.id.btn_button)
        btnButton.setOnClickListener{rollDice()}


    }

    private fun rollDice ()
    {

        val editTextOne: EditText = findViewById(R.id.edtNumber1)
        editTextOne.setOnClickListener{rollDice()}

        val editTextTwo: EditText = findViewById(R.id.edtNumber2)
        editTextTwo.setOnClickListener{rollDice()}

        if (editTextOne.length() !=0)
        {
            if (Integer.parseInt(editTextOne.text.toString()) > Integer.parseInt(editTextTwo.text.toString()))
            {
                Toast.makeText(this, "O primeiro é maior", Toast.LENGTH_SHORT).show()
            }

            else if (Integer.parseInt(editTextOne.text.toString()) < Integer.parseInt(editTextTwo.text.toString()))
            {
                Toast.makeText(this, "O segundo é maior", Toast.LENGTH_SHORT).show()
            }

            else
            {
                Toast.makeText(this,"Os números são iguais", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(this,"Este caractere é inválido", Toast.LENGTH_SHORT).show()
        }
    }
}