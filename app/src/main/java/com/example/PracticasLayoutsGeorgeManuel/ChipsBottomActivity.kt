package com.example.PracticasLayoutsGeorgeManuel

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.PracticasLayoutsGeorgeManuel.R;

class ChipsBottomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chips_bottom)

        val listView = findViewById<ListView>(R.id.listView)

        //lista de generos
        val generos = arrayOf(
            "Accion",
            "Aventura",
            "Deportes",
            "Disparos",
            "Estrategia",
            "Lucha",
            "Musical",
            "Rol",
            "Simulación"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, generos)
        listView.adapter = adapter
    }
}
