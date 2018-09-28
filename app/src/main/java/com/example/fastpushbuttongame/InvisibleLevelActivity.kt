package com.example.fastpushbuttongame

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_invisible_level.*
import kotlin.concurrent.timer

class InvisibleLevelActivity : AppCompatActivity() {

    private var button = 1
    private var buttonCount = 256
    private var timerCount = 0
    private var countFinish = false

    private fun Timer() {
        val handler = Handler()
        //val pref = PreferenceManager.getDefaultSharedPreferences(this)
        //val editor = pref.edit()

        timer(period = 1) {
            handler.post {
                when (countFinish) {
                    true -> {
                        timerCount += 0
                        /*
                        editor.putInt("H1HighScore", timerCount)
                        if (intent.getIntExtra("H1_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("H1_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        */
                        backButton13.visibility = View.VISIBLE
                        finishText13.text = "おつかれさま！"
                    }
                    false -> {
                        timerCount += 1
                        backButton13.visibility = View.INVISIBLE
                    }
                }
                timerText13.text = "Time：" + timerCount + "msec"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invisible_level)

        buttonText13.text = "Button：" + button
        timerText13.text = "Time：0msec"
        finishText13.text = ""
        bigButton.text = buttonCount.toString()

        bigButton.setOnClickListener {
            when (bigButton.text) {
                "0" -> button = button
                else -> buttonCount -= 1
            }
            buttonText13.text = "Button：" + button
            bigButton.text = buttonCount.toString()
            if (buttonCount == 0)  {
                buttonText13.text = "Button：0"
                countFinish = true
            }
            else if (buttonCount == 255){
                Timer()
            }
        }

        backButton13.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("Thank you for Playing!!")
                setPositiveButton("Close") { _, _ -> finish() }
                show()
            }
        }
    }
}
