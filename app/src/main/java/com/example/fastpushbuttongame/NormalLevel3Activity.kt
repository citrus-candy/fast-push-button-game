package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_normal_level3.*
import kotlin.concurrent.timer

class NormalLevel3Activity : AppCompatActivity() {

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
                        editor.putInt("N3HighScore", timerCount)
                        if (intent.getIntExtra("N3_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("N3_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton5.visibility = View.VISIBLE
                        finishText5.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton5.visibility = View.INVISIBLE
                    }
                }
                timerText5.text = "Time：" + timerCount + "msec"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_level3)

        buttonText5.text = "ImageButton：" + button
        timerText5.text = "Time：0msec"
        finishText5.text = ""

        imageButton3.setOnClickListener {
            when (imageButton3.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton3.contentDescription = "OK"
            imageButton3.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton4.setOnClickListener {
            when (imageButton4.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton4.contentDescription = "OK"
            imageButton4.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton5.setOnClickListener {
            when (imageButton5.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton5.contentDescription = "OK"
            imageButton5.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton6.setOnClickListener {
            when (imageButton6.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton6.contentDescription = "OK"
            imageButton6.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton7.setOnClickListener {
            when (imageButton7.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton7.contentDescription = "OK"
            imageButton7.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton8.setOnClickListener {
            when (imageButton8.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton8.contentDescription = "OK"
            imageButton8.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton9.setOnClickListener {
            when (imageButton9.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton9.contentDescription = "OK"
            imageButton9.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton10.setOnClickListener {
            when (imageButton10.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton10.contentDescription = "OK"
            imageButton10.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton11.setOnClickListener {
            when (imageButton11.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton11.contentDescription = "OK"
            imageButton11.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton12.setOnClickListener {
            when (imageButton12.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText5.text = "ImageButton：" + button
            imageButton12.contentDescription = "OK"
            imageButton12.setImageResource(R.drawable.btn043_10)
            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }

        button18.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button17.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button27.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button28.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button30.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button31.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button32.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }
        button33.setOnClickListener {
            when(isCount) {
                true -> timerCount += 100
            }
        }

        backButton5.setOnClickListener {
            finish()
        }
    }
}
