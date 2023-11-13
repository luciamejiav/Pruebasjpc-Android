package net.azarquiel.pruebasjpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvWelcome: TextView
    private val name = "Lucía" //val es una variable cambiante

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcome = findViewById<TextView>(R.id.textView)
        var btnClic = findViewById<Button>(R.id.btnClic) //var es una variable que no cambia
        btnClic.setOnClickListener { onClickbtn() }

    }

    private fun onClickbtn() {
        tvWelcome.text = "Welcome $name"
    }
}