package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level3.*
import kotlin.concurrent.timer

class HardLevel3Activity : Activity() {

    private var button = 8
    private var timerCount = 0
    private var isCount = false
    private var countFinish = false

    private fun Timer() {
        val handler = Handler()
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        timer(period = 1) {
            handler.post {
                when (countFinish) {
                    true -> {
                        timerCount += 0
                        editor.putInt("H3HighScore", timerCount)
                        if (intent.getIntExtra("H3_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H3_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton7.visibility = View.VISIBLE
                        finishText7.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton7.visibility = View.INVISIBLE
                    }
                }
                timerText7.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hard_level3)

        buttonText7.text = "Box：" + button
        timerText7.text = "Time：0msec"
        finishText7.text = ""

        checkBox14.setOnClickListener {
            when (checkBox14.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox14.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox15.setOnClickListener {
            when (checkBox15.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox15.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox16.setOnClickListener {
            when (checkBox16.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox16.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox17.setOnClickListener {
            when (checkBox17.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox17.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox18.setOnClickListener {
            when (checkBox18.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox18.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox19.setOnClickListener {
            when (checkBox19.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox19.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox20.setOnClickListener {
            when (checkBox20.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox20.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox21.setOnClickListener {
            when (checkBox21.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox21.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox22.setOnClickListener {
            when (checkBox22.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText7.text = "Box：" + button
            checkBox22.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        radioButton14.setOnClickListener {
            radioButton14.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton15.setOnClickListener {
            radioButton15.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton16.setOnClickListener {
            radioButton16.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton17.setOnClickListener {
            radioButton17.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton18.setOnClickListener {
            radioButton18.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton19.setOnClickListener {
            radioButton19.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton20.setOnClickListener {
            radioButton20.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton21.setOnClickListener {
            radioButton21.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton22.setOnClickListener {
            radioButton22.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }

        backButton7.setOnClickListener {
            finish()}
    }
}
