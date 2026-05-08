package com.example.facturacionpython

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Este es tu layout con el formulario y el botón
        setContentView(R.layout.activity_main2)

        val botonRegistro = findViewById<Button>(R.id.button3)

        botonRegistro.setOnClickListener {
            // Redirigir a MainActivity (que usa activity_main.xml)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Si quieres que MainActivity2 se cierre y no quede en el historial:
            // finish()
        }
    }
}