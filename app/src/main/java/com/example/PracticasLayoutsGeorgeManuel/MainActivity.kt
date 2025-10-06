package com.example.PracticasLayoutsGeorgeManuel

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //boton PLAY abre GamesActivity
        val btnPlay = findViewById<Button>(R.id.button)
        btnPlay.setOnClickListener {
            val i = Intent(this, GamesActivity::class.java)
            startActivity(i)
        }

        //boton NEW PLAYER abre NewPlayer
        val btnNewPlayer = findViewById<Button>(R.id.button2)
        btnNewPlayer.setOnClickListener {
            val i = Intent(this, NewPlayer::class.java)
            startActivity(i)
        }

        //boton PREFERENCES abre PreferencesActivity
        val btnPreferences = findViewById<Button>(R.id.button1)
        btnPreferences.setOnClickListener {
            val i = Intent(this, PreferencesActivity::class.java)
            startActivity(i)
        }

        //boton ABOUT abre ChipsBottomActivity
        val btnAbout = findViewById<Button>(R.id.button3)
        btnAbout.setOnClickListener {
            val i = Intent(this, ChipsBottomActivity::class.java)
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
