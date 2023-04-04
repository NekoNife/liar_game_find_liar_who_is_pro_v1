package com.example.liar_game_find_liar_who_is

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
    }
}