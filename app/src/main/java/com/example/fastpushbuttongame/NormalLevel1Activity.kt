package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_normal_level1.*
import kotlin.concurrent.timer

class NormalLevel1Activity : AppCompatActivity() {

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
                        editor.putInt("N1HighScore", timerCount)
                        if (intent.getIntExtra("N1_HIGHSCORE", 0) > timerCount) {
                            editor.apply()
                        }
                        backButton.visibility = View.VISIBLE
                        finishText.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton.visibility = View.INVISIBLE
                    }
                }
                timerText.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_level1)

        buttonText.text = "Button：" + button
        timerText.text = "Time：0msec"
        finishText.text = ""

        button2.setOnClickListener {
            when (button2.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button2.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button3.setOnClickListener {
            when (button3.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button3.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button4.setOnClickListener {
            when (button4.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button4.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button5.setOnClickListener {
            when (button5.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button5.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button6.setOnClickListener {
            when (button6.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button6.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button7.setOnClickListener {
            when (button7.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button7.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button8.setOnClickListener {
            when (button8.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button8.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button9.setOnClickListener {
            when (button9.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button9.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button10.setOnClickListener {
            when (button10.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button10.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button11.setOnClickListener {
            when (button11.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText.text = "Button：" + button
            button11.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton.setOnClickListener { finish()}
    }
}
