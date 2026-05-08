package com.example.facturacionpython  // usa el nombre real de tu paquete

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Carga el layout que creaste
        setContentView(R.layout.activity_main3)

        // Referencias a los botones
        val btnGenerar = findViewById<Button>(R.id.btnGenerar)
        val btnImprimir = findViewById<Button>(R.id.btnImprimir)

        // Acciones de los botones
        btnGenerar.setOnClickListener {
            Toast.makeText(this, "Factura generada correctamente", Toast.LENGTH_SHORT).show()
        }

        btnImprimir.setOnClickListener {
            Toast.makeText(this, "Factura enviada a impresión", Toast.LENGTH_SHORT).show()
        }
    }
}