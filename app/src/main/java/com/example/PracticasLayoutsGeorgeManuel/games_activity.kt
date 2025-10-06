/* package com.example.PracticasLayoutsGeorgeManuel

import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class GamesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        val checkAngry = findViewById<CheckBox>(R.id.checkAngry)
        val checkDragon = findViewById<CheckBox>(R.id.checkDragon)
        val checkHill = findViewById<CheckBox>(R.id.checkHillClimb)
        val checkRadiant = findViewById<CheckBox>(R.id.checkRadiant)
        val checkSoccer = findViewById<CheckBox>(R.id.checkSoccer)
        val checkNinja = findViewById<CheckBox>(R.id.checkNinja)
        val checkAir = findViewById<CheckBox>(R.id.checkAirControl)

        val fab = findViewById<FloatingActionButton>(R.id.fabGames)

        fab.setOnClickListener {
            val selected = mutableListOf<String>()

            if (checkAngry.isChecked) selected.add("Angry Birds")
            if (checkDragon.isChecked) selected.add("Dragon Fly")
            if (checkHill.isChecked) selected.add("Hill Climbing Racing")
            if (checkRadiant.isChecked) selected.add("Radiant Defense")
            if (checkSoccer.isChecked) selected.add("Pocket Soccer")
            if (checkNinja.isChecked) selected.add("Ninja Jump")
            if (checkAir.isChecked) selected.add("Air Control")

            if (selected.isEmpty()) {
                Toast.makeText(this, "No has seleccionado ningún juego", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Has seleccionado: ${selected.joinToString()}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
*/