package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level1.*
import kotlin.concurrent.timer

class HardLevel1Activity : AppCompatActivity() {

    private var button = 10
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
                        editor.putInt("H1HighScore", timerCount)
                        if (intent.getIntExtra("H1_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H1_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton3.visibility = View.VISIBLE
                        finishText3.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton3.visibility = View.INVISIBLE
                    }
                }
                timerText3.text = "Time：" + timerCount + "msec"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hard_level1)

        buttonText3.text = "Button&Box：" + button
        timerText3.text = "Time：0msec"
        finishText3.text = ""

        radioButton.setOnClickListener {
            when (radioButton.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            radioButton.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton2.setOnClickListener {
            when (radioButton2.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            radioButton2.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton3.setOnClickListener {
            when (radioButton3.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            radioButton3.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton4.setOnClickListener {
            when (radioButton4.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            radioButton4.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton5.setOnClickListener {
            when (radioButton5.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            radioButton5.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox.setOnClickListener {
            when (checkBox.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            checkBox.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox2.setOnClickListener {
            when (checkBox2.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            checkBox2.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox3.setOnClickListener {
            when (checkBox3.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            checkBox3.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox4.setOnClickListener {
            when (checkBox4.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            checkBox4.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox5.setOnClickListener {
            when (checkBox5.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText3.text = "Button&Box：" + button
            checkBox5.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton3.setOnClickListener {
            finish()
        }
    }
}
