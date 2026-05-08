package com.example.facturacionpython  // usa el nombre real de tu paquete

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity   // IMPORTANTE

class FacturaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factura)

        val header = findViewById<TextView>(R.id.tvHeader)
        val btnGenerar = findViewById<Button>(R.id.btnGenerar)
        val btnImprimir = findViewById<Button>(R.id.btnImprimir)

        btnGenerar.setOnClickListener {
            Toast.makeText(this, "Factura generada correctamente", Toast.LENGTH_SHORT).show()
        }

        btnImprimir.setOnClickListener {
            Toast.makeText(this, "Imprimir Factura", Toast.LENGTH_SHORT).show()
        }
    }
}
