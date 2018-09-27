package com.example.fastpushbuttongame

import android.os.Bundle
import android.app.Activity
import android.os.Handler
import android.preference.PreferenceManager
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_hard_level3.*
import kotlinx.android.synthetic.main.activity_very_hard_level3.*
import java.util.*
import kotlin.concurrent.timer

class VeryHardLevel3Activity : Activity() {

    private var button = 17
    private var timerCount = 0
    private var isCount = false
    private var countFinish = false
    private var seed = 0
    private var arrayOfInt = IntArray(button)
    private var randomFlag = true

    private fun Timer() {
        val handler = Handler()
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        timer(period = 1) {
            handler.post {
                when (countFinish) {
                    true -> {
                        timerCount += 0
                        editor.putInt("VH3HighScore", timerCount)
                        if (intent.getIntExtra("VH3_HIGHSCORE", 0) > timerCount ||
                                intent.getIntExtra("VH3_HIGHSCORE", 0) == 0) {
                            editor.apply()
                        }
                        backButton11.visibility = View.VISIBLE
                        finishText11.text = "Finish!!"
                    }
                    false -> {
                        timerCount += 1
                        backButton11.visibility = View.INVISIBLE
                    }
                }
                timerText11.text = "Time：" + timerCount + "msec"
            }
        }
    }

    private fun radioButtonVisibility_INVISIBLE () {
        radioButton35.visibility = View.INVISIBLE
        radioButton36.visibility = View.INVISIBLE
        radioButton37.visibility = View.INVISIBLE
        radioButton38.visibility = View.INVISIBLE
        radioButton39.visibility = View.INVISIBLE
        radioButton40.visibility = View.INVISIBLE
        radioButton41.visibility = View.INVISIBLE
        radioButton42.visibility = View.INVISIBLE
        radioButton43.visibility = View.INVISIBLE
        radioButton44.visibility = View.INVISIBLE
        radioButton45.visibility = View.INVISIBLE
        radioButton46.visibility = View.INVISIBLE
        radioButton47.visibility = View.INVISIBLE
        radioButton48.visibility = View.INVISIBLE
        radioButton49.visibility = View.INVISIBLE
        radioButton50.visibility = View.INVISIBLE
    }

    private fun randomRadioButtonVisibility(randomSeed: Int): Boolean {
        val boolean: Boolean

        when(randomSeed) {
            0 -> {
                if (arrayOfInt[0] != 100) {
                    radioButton35.visibility = View.VISIBLE
                    arrayOfInt[0] = 100
                    boolean = false
                }
                else {
                    boolean = true
                }
            }
            1 -> {
               if (arrayOfInt[1] != 100) {
                    radioButton36.visibility = View.VISIBLE
                    arrayOfInt[1] = 100
                    boolean = false
                }
                else {
                    boolean = true
                }
            }
            2 -> {
                if (arrayOfInt[2] != 100) {
                    radioButton37.visibility = View.VISIBLE
                    arrayOfInt[2] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            3 -> {
                if (arrayOfInt[3] != 100) {
                    radioButton38.visibility = View.VISIBLE
                    arrayOfInt[3] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            4 -> {
                if (arrayOfInt[4] != 100) {
                    radioButton39.visibility = View.VISIBLE
                    arrayOfInt[4] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            5 -> {
                if (arrayOfInt[5] != 100) {
                    radioButton40.visibility = View.VISIBLE
                    arrayOfInt[5] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            6 -> {
                if (arrayOfInt[6] != 100) {
                    radioButton41.visibility = View.VISIBLE
                    arrayOfInt[6] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            7 -> {
                if (arrayOfInt[7] != 100) {
                    radioButton42.visibility = View.VISIBLE
                    arrayOfInt[7] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            8 -> {
                if (arrayOfInt[8] != 100) {
                    radioButton43.visibility = View.VISIBLE
                    arrayOfInt[8] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            9 -> {
                if (arrayOfInt[9] != 100) {
                    radioButton44.visibility = View.VISIBLE
                    arrayOfInt[9] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            10 -> {
                if (arrayOfInt[10] != 100) {
                    radioButton45.visibility = View.VISIBLE
                    arrayOfInt[10] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            11 -> {
                if (arrayOfInt[11] != 100) {
                    radioButton46.visibility = View.VISIBLE
                    arrayOfInt[11] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            12 -> {
                if (arrayOfInt[12] != 100) {
                    radioButton47.visibility = View.VISIBLE
                    arrayOfInt[12] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            13 -> {
                if (arrayOfInt[13] != 100) {
                    radioButton48.visibility = View.VISIBLE
                    arrayOfInt[13] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            14 -> {
                if (arrayOfInt[14] != 100) {
                    radioButton49.visibility = View.VISIBLE
                    arrayOfInt[14] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            15 -> {
                if (arrayOfInt[15] != 100) {
                    radioButton50.visibility = View.VISIBLE
                    arrayOfInt[15] = 100
                    boolean = false
                } else {
                    boolean = true
                }
            }
            16 -> {
                if (radioButton34.visibility == View.INVISIBLE) {
                    radioButton34.visibility = View.VISIBLE
                } else if (radioButton35.visibility == View.INVISIBLE) {
                    radioButton35.visibility = View.VISIBLE
                } else if (radioButton36.visibility == View.INVISIBLE) {
                    radioButton36.visibility = View.VISIBLE
                } else if (radioButton37.visibility == View.INVISIBLE) {
                    radioButton37.visibility = View.VISIBLE
                } else if (radioButton38.visibility == View.INVISIBLE) {
                    radioButton38.visibility = View.VISIBLE
                } else if (radioButton39.visibility == View.INVISIBLE) {
                    radioButton39.visibility = View.VISIBLE
                } else if (radioButton40.visibility == View.INVISIBLE) {
                    radioButton40.visibility = View.VISIBLE
                } else if (radioButton41.visibility == View.INVISIBLE) {
                    radioButton41.visibility = View.VISIBLE
                } else if (radioButton42.visibility == View.INVISIBLE) {
                    radioButton42.visibility = View.VISIBLE
                } else if (radioButton43.visibility == View.INVISIBLE) {
                    radioButton43.visibility = View.VISIBLE
                } else if (radioButton44.visibility == View.INVISIBLE) {
                    radioButton44.visibility = View.VISIBLE
                } else if (radioButton45.visibility == View.INVISIBLE) {
                    radioButton45.visibility = View.VISIBLE
                } else if (radioButton46.visibility == View.INVISIBLE) {
                    radioButton46.visibility = View.VISIBLE
                } else if (radioButton47.visibility == View.INVISIBLE) {
                    radioButton47.visibility = View.VISIBLE
                } else if (radioButton48.visibility == View.INVISIBLE) {
                    radioButton48.visibility = View.VISIBLE
                } else if (radioButton49.visibility == View.INVISIBLE) {
                    radioButton49.visibility = View.VISIBLE
                } else if (radioButton50.visibility == View.INVISIBLE) {
                    radioButton50.visibility = View.VISIBLE
                }
                boolean = false
            }
            else -> boolean = false
        }

        return boolean
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_very_hard_level3)

        buttonText11.text = "Button：" + button
        timerText11.text = "Time：0msec"
        finishText11.text = ""

        radioButtonVisibility_INVISIBLE()

        var i = 0
        while(i < button) {
            arrayOfInt[i] = i
            i++
        }

        radioButton34.setOnClickListener {
            when (radioButton34.text) {
                "OK" -> button = button
                else -> {
                    do {
                        seed = java.util.Random().nextInt(17)
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)
                    button -= 1
                }
            }
            buttonText11.text = "Button：" + button
            radioButton34.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                    Timer()
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton35.setOnClickListener {
            when (radioButton35.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton35.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton36.setOnClickListener {
            when (radioButton36.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton36.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton37.setOnClickListener {
            when (radioButton37.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton37.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton38.setOnClickListener {
            when (radioButton38.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton38.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton39.setOnClickListener {
            when (radioButton39.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton39.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton40.setOnClickListener {
            when (radioButton40.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton40.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton41.setOnClickListener {
            when (radioButton41.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)
                }
            }
            buttonText11.text = "Button：" + button
            radioButton41.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton42.setOnClickListener {
            when (radioButton42.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton42.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton43.setOnClickListener {
            when (radioButton43.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton43.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton44.setOnClickListener {
            when (radioButton44.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton44.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton45.setOnClickListener {
            when (radioButton45.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton45.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton46.setOnClickListener {
            when (radioButton46.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton46.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton47.setOnClickListener {
            when (radioButton47.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton47.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton48.setOnClickListener {
            when (radioButton48.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton48.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton49.setOnClickListener {
            when (radioButton49.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton49.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }
        radioButton50.setOnClickListener {
            when (radioButton50.text) {
                "OK" -> button = button
                else -> {
                    button -= 1
                    do {
                        if (button != 1) {
                            seed = java.util.Random().nextInt(16)
                        }
                        else {
                            seed = 16
                        }
                        randomFlag = randomRadioButtonVisibility(seed)
                    } while(randomFlag)

                }
            }
            buttonText11.text = "Button：" + button
            radioButton50.text = "OK"

            when (isCount) {
                false -> {
                    isCount = true
                }
            }
            if (button == 0)  countFinish = true
        }

        backButton11.setOnClickListener {
            finish()}
    }

}
