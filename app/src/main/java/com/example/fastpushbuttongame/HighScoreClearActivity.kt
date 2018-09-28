package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager

class HighScoreClearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_score_clear)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit().clear().apply()
        finish()
    }
}
