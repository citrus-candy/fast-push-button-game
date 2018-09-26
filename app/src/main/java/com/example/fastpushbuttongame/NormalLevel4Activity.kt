package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_normal_level4.*
import kotlin.concurrent.timer

class NormalLevel4Activity : AppCompatActivity() {

    private var button = 7
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
                        editor.putInt("N4HighScore", timerCount)
                        if (intent.getIntExtra("N4_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("N4_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton6.visibility = View.VISIBLE
                        finishText6.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton6.visibility = View.INVISIBLE
                    }
                }
                timerText6.text = "Time：" + timerCount + "msec"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_level4)

        buttonText6.text = "ImageButton：" + button
        timerText6.text = "Time：0msec"
        finishText6.text = ""

        imageButton.setOnClickListener {
            when (imageButton.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton.contentDescription = "OK"
            imageButton.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton14.setOnClickListener {
            when (imageButton14.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton14.contentDescription = "OK"
            imageButton14.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton16.setOnClickListener {
            when (imageButton16.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton16.contentDescription = "OK"
            imageButton16.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton18.setOnClickListener {
            when (imageButton18.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton18.contentDescription = "OK"
            imageButton18.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton20.setOnClickListener {
            when (imageButton20.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton20.contentDescription = "OK"
            imageButton20.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton19.setOnClickListener {
            when (imageButton19.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton19.contentDescription = "OK"
            imageButton19.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton17.setOnClickListener {
            when (imageButton17.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText6.text = "ImageButton：" + button
            imageButton17.contentDescription = "OK"
            imageButton17.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button39.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button25.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button35.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button36.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button37.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button38.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }

        backButton6.setOnClickListener {
            finish()}
    }
}
