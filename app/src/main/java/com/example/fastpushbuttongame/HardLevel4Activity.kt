package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level4.*
import kotlin.concurrent.timer

class HardLevel4Activity : Activity() {

    private var button = 13
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
                        editor.putInt("H4HighScore", timerCount)
                        if (intent.getIntExtra("H4_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H4_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton8.visibility = View.VISIBLE
                        finishText8.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton8.visibility = View.INVISIBLE
                    }
                }
                timerText8.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hard_level4)

        buttonText8.text = "Box：" + button
        timerText8.text = "Time：0msec"
        finishText8.text = ""

        checkBox23.setOnClickListener {
            when (checkBox23.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox23.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox24.setOnClickListener {
            when (checkBox24.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox24.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox25.setOnClickListener {
            when (checkBox25.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox25.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox26.setOnClickListener {
            when (checkBox26.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox26.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox27.setOnClickListener {
            when (checkBox27.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox27.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox29.setOnClickListener {
            when (checkBox29.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox29.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox30.setOnClickListener {
            when (checkBox30.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox30.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox32.setOnClickListener {
            when (checkBox32.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox32.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox33.setOnClickListener {
            when (checkBox33.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox33.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox34.setOnClickListener {
            when (checkBox34.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox34.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox35.setOnClickListener {
            when (checkBox35.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox35.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox36.setOnClickListener {
            when (checkBox36.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox36.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox37.setOnClickListener {
            when (checkBox37.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText8.text = "Box：" + button
            checkBox37.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        radioButton23.setOnClickListener {
            radioButton23.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton24.setOnClickListener {
            radioButton23.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton25.setOnClickListener {
            radioButton25.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton26.setOnClickListener {
            radioButton26.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }
        radioButton27.setOnClickListener {
            radioButton27.text = "NG"
            when(isCount) {
                true -> timerCount += 200
            }
        }

        backButton8.setOnClickListener {
            finish()}
    }
}
