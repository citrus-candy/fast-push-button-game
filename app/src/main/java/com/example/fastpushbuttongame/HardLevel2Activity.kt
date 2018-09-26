package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level2.*
import kotlin.concurrent.timer

class HardLevel2Activity : AppCompatActivity() {

    private var button = 16
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
                        editor.putInt("H2HighScore", timerCount)
                        if (intent.getIntExtra("H2_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H2_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton4.visibility = View.VISIBLE
                        finishText4.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton4.visibility = View.INVISIBLE
                    }
                }
                timerText4.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hard_level2)

        buttonText4.text = "Button&Box：" + button
        timerText4.text = "Time：0msec"
        finishText4.text = ""

        radioButton6.setOnClickListener {
            when (radioButton6.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton6.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton7.setOnClickListener {
            when (radioButton7.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton7.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton8.setOnClickListener {
            when (radioButton8.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton8.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton9.setOnClickListener {
            when (radioButton9.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton9.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton10.setOnClickListener {
            when (radioButton10.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton10.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton11.setOnClickListener {
            when (radioButton11.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton11.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton12.setOnClickListener {
            when (radioButton12.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton12.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton12.setOnClickListener {
            when (radioButton12.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton12.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton13.setOnClickListener {
            when (radioButton13.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            radioButton13.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        checkBox6.setOnClickListener {
            when (checkBox6.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox6.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox7.setOnClickListener {
            when (checkBox7.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox7.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox8.setOnClickListener {
            when (checkBox8.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox8.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox9.setOnClickListener {
            when (checkBox9.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox9.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox10.setOnClickListener {
            when (checkBox10.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox10.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox11.setOnClickListener {
            when (checkBox11.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox11.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox12.setOnClickListener {
            when (checkBox12.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox12.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox13.setOnClickListener {
            when (checkBox13.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText4.text = "Button&Box：" + button
            checkBox13.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton4.setOnClickListener{
            finish()
        }
    }
}
