package com.example.PracticasLayoutsGeorgeManuel

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)

        //listener de SeekBar
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@PreferencesActivity, "Nivel: ${seekBar?.progress}", Toast.LENGTH_SHORT).show()
            }
        })

        // Listener de RatingBar
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "Valoración: $rating estrellas", Toast.LENGTH_SHORT).show()
        }

        // Listener del FAB
        fab.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(this, "Selecciona un juego primero", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preferencias guardadas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
