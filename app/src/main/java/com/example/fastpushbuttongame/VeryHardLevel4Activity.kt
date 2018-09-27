package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.app.Presentation
import android.preference.PreferenceManager

import kotlinx.android.synthetic.main.activity_very_hard_level4.*

class VeryHardLevel4Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_very_hard_level4)

        buttonText12.text = "Button:NotAvailable"
        timerText12.text = "Timer:Infinity"

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val edit = pref.edit()
        edit.putString("VH4HighScore", "Infinity").apply()

        imageButton29.setOnClickListener {
            var warning = 1234
            while(true){
                warning++
                timerText12.text = "Timer:" + warning * 5678
            }
        }

        backButton12.setOnClickListener {
            finish()
        }
    }

}
