package com.example.liar_game_find_liar_who_is

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this, MainActivity::class.java))

            // close this activity
            finish()
        }, 1500)
    }
}