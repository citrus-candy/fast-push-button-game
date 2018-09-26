package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level1.*
import kotlinx.android.synthetic.main.activity_normal_level1.*
import kotlinx.android.synthetic.main.activity_normal_level2.*
import kotlin.concurrent.timer

class NormalLevel2Activity : AppCompatActivity() {

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
                        editor.putInt("N2HighScore", timerCount)
                        if (intent.getIntExtra("N2_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H1_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton2.visibility = View.VISIBLE
                        finishText2.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton2.visibility = View.INVISIBLE
                    }
                }
                timerText2.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_level2)


        buttonText2.text = "Button：" + button
        timerText2.text = "Time：0msec"
        finishText2.text = ""

        button22.setOnClickListener {
            when (button22.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button22.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button23.setOnClickListener {
            when (button23.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button23.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button24.setOnClickListener {
            when (button24.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button24.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button26.setOnClickListener {
            when (button26.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button26.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button29.setOnClickListener {
            when (button29.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button29.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button12.setOnClickListener {
            when (button12.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button12.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button13.setOnClickListener {
            when (button13.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button13.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button14.setOnClickListener {
            when (button14.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button14.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button15.setOnClickListener {
            when (button15.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button15.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button16.setOnClickListener {
            when (button16.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button16.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button19.setOnClickListener {
            when (button19.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button19.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button20.setOnClickListener {
            when (button20.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button20.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        button21.setOnClickListener {
            when (button21.text) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText2.text = "Button：" + button
            button21.text = "OK"
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton2.setOnClickListener { finish()}
    }
}
