package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_very_hard_level1.*
import kotlin.concurrent.timer

class VeryHardLevel1Activity : Activity() {

    private var button = 18
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
                        editor.putInt("VH1HighScore", timerCount)
                        if (intent.getIntExtra("VH1_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("VH1_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton9.visibility = View.VISIBLE
                        finishText9.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton9.visibility = View.INVISIBLE
                    }
                }
                timerText9.text = "Time：" + timerCount + "msec"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_very_hard_level1)


        buttonText9.text = "AllButton：" + button
        timerText9.text = "Time：0msec"
        finishText9.text = ""

        button34.setOnClickListener {
            when (button34.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            button34.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button40.setOnClickListener {
            when (button40.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            button40.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button41.setOnClickListener {
            when (button41.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            button41.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button42.setOnClickListener {
            when (button42.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            button42.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        imageButton2.setOnClickListener {
            when (imageButton2.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            imageButton2.contentDescription = "OK"
            imageButton2.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton13.setOnClickListener {
            when (imageButton13.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            imageButton13.contentDescription = "OK"
            imageButton13.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton15.setOnClickListener {
            when (imageButton15.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            imageButton15.contentDescription = "OK"
            imageButton15.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton21.setOnClickListener {
            when (imageButton21.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            imageButton21.contentDescription = "OK"
            imageButton21.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        checkBox28.setOnClickListener {
            when (checkBox28.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            checkBox28.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox31.setOnClickListener {
            when (checkBox31.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            checkBox31.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox38.setOnClickListener {
            when (checkBox38.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            checkBox38.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        checkBox39.setOnClickListener {
            when (checkBox39.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton：" + button
            checkBox39.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        radioButton28.setOnClickListener {
            when (radioButton28.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton28.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton29.setOnClickListener {
            when (radioButton29.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton29.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton30.setOnClickListener {
            when (radioButton30.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton30.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton31.setOnClickListener {
            when (radioButton31.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton31.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton32.setOnClickListener {
            when (radioButton32.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton32.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton33.setOnClickListener {
            when (radioButton33.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText9.text = "AllButton" + button
            radioButton33.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton9.setOnClickListener {
            finish()
        }
    }

}
