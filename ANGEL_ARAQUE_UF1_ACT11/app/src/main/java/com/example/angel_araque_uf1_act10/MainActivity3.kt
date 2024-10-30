package com.example.angel_araque_uf1_act10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val registrarse: Button = findViewById(R.id.registro)
        val linear: Button = findViewById(R.id.LinearButton)
        val relative: Button = findViewById(R.id.RelativeButton)
        val nombre: EditText = findViewById(R.id.nombre)
        val apellido: EditText = findViewById(R.id.apellido)
        val edad: EditText = findViewById(R.id.edad)
        val usuario: EditText = findViewById(R.id.usuario)
        val cotrasenya: EditText = findViewById(R.id.contrasenya)

        registrarse.setOnClickListener {
            if(nombre.text.isEmpty() || apellido.text.isEmpty() || edad.text.isEmpty() || usuario.text.isEmpty() || cotrasenya.text.isEmpty())
                Toast.makeText(this,"No se pudo completar el registro rellene todos los campos",
                    Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Registro completado", Toast.LENGTH_SHORT).show()
        }

        linear.setOnClickListener()
        {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        relative.setOnClickListener()
        {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}