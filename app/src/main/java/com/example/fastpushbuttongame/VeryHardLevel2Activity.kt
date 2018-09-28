package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.os.Handler
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_very_hard_level2.*
import kotlin.concurrent.timer

class VeryHardLevel2Activity : Activity() {


    private var button = 5
    private var timerCount = 0
    private var isCount = false
    private var countFinish = false
    private var buttonFlag1 = false
    private var buttonFlag2 = false
    private var buttonFlag3 = false
    private var buttonFlag4 = false

    private fun Timer() {
        val handler = Handler()
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        timer(period = 1) {
            handler.post {
                when (countFinish) {
                    true -> {
                        timerCount += 0
                        editor.putInt("VH2HighScore", timerCount)
                        if (intent.getIntExtra("VH2_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("VH2_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        imageView2.visibility = View.VISIBLE
                        backButton10.visibility = View.VISIBLE
                        finishText10.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        imageView2.visibility = View.INVISIBLE
                        backButton10.visibility = View.INVISIBLE
                    }
                }
                timerText10.text = "Time：" + timerCount + "msec"
            }
        }
    }

    private fun visibilityButton(visibility: Boolean) {
        if(visibility) {
            imageButton23.visibility = View.VISIBLE
            imageButton24.visibility = View.VISIBLE
            imageButton25.visibility = View.VISIBLE
            imageView.visibility = View.VISIBLE
            imageView3.visibility = View.VISIBLE
            imageView4.visibility = View.VISIBLE
            imageView10.visibility = View.VISIBLE
            imageView11.visibility = View.VISIBLE
            imageView13.visibility = View.VISIBLE
        }
        else {
            imageButton23.visibility = View.INVISIBLE
            imageButton24.visibility = View.INVISIBLE
            imageButton25.visibility = View.INVISIBLE
            imageView.visibility = View.INVISIBLE
            imageView3.visibility = View.INVISIBLE
            imageView4.visibility = View.INVISIBLE
            imageView10.visibility = View.INVISIBLE
            imageView11.visibility = View.INVISIBLE
            imageView13.visibility = View.INVISIBLE
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_very_hard_level2)

        buttonText10.text = "Button：" + button
        timerText10.text = "Time：0msec"
        finishText10.text = ""

        visibilityButton(false)
        button43.visibility = View.INVISIBLE

        imageButton22.setOnClickListener {
            when (imageButton22.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText10.text = "Button：" + button
            imageButton22.contentDescription = "OK"
            imageView12.setImageResource(R.drawable.button_start2)

            if (buttonFlag3) {
                imageButton25.contentDescription = ""
                imageView13.setImageResource(R.drawable.reset_buttn_off)
                buttonFlag3 = false
            }

            visibilityButton(true)

            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton23.setOnClickListener {
            when (imageButton23.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText10.text = "Button：" + button
            imageButton23.contentDescription = "OK"
            imageView11.setImageResource(R.drawable.buttun_bus_on)

            buttonFlag1 = true
            if (buttonFlag1 && buttonFlag2) {
                button43.visibility = View.VISIBLE
            }

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton24.setOnClickListener {
            when (imageButton24.contentDescription) {
                "OK" -> button = button
                else -> button -= 1
            }
            buttonText10.text = "Button：" + button
            imageButton24.contentDescription = "OK"
            imageView10.setImageResource(R.drawable.hokousyayou_button_omachi)

            buttonFlag2 = true
            if (buttonFlag1 && buttonFlag2) {
                button43.visibility = View.VISIBLE
            }

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        imageButton25.setOnClickListener {
            when (imageButton25.contentDescription) {
                "OK" -> button = button
                else -> if(!buttonFlag4) button = 5
            }
            buttonText10.text = "Button：" + button
            imageButton25.contentDescription = "OK"
            imageView13.setImageResource(R.drawable.reset_buttn_on)

            visibilityButton(false)
            imageButton22.contentDescription = ""
            imageView12.setImageResource(R.drawable.button_start1)
            imageButton23.contentDescription = ""
            imageView11.setImageResource(R.drawable.buttun_bus_off)
            imageButton24.contentDescription = ""
            imageView10.setImageResource(R.drawable.hokousyayou_button_oshite)
            button43.visibility = View.INVISIBLE
            buttonFlag1 = false
            buttonFlag2 = false

            if (!buttonFlag3) {
                buttonFlag3 = true
            }

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        button43.setOnClickListener {
            when (button43.contentDescription) {
                "OK" -> button = button
                else -> button -= 2
            }
            buttonText10.text = "Button：" + button
            imageButton25.contentDescription = "OK"
            imageView13.setImageResource(R.drawable.reset_buttn_on)
            button43.contentDescription = "OK"
            buttonFlag4 = true

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true

        }

        backButton10.setOnClickListener {
            finish()
        }
    }

}
