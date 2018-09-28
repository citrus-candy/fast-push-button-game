package com.example.fastpushbuttongame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.RadioButton
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var gameMode = 0
    private var level = 1

    // ハイスコア
    private fun highScore(gameMode: Int, level: Int){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        when (gameMode) {
            0 -> {
                when (level) {
                    1 -> highScore.text = "HighScore：" + pref.getInt("N1HighScore", 0).toString() + "msec"
                    2 -> highScore.text = "HighScore：" + pref.getInt("N2HighScore", 0).toString() + "msec"
                    3 -> highScore.text = "HighScore：" + pref.getInt("N3HighScore", 0).toString() + "msec"
                    4 -> highScore.text = "HighScore：" + pref.getInt("N4HighScore", 0).toString() + "msec"
                }
            }
            1 -> {
                when (level) {
                    1 -> highScore.text = "HighScore：" + pref.getInt("H1HighScore", 0).toString() + "msec"
                    2 -> highScore.text = "HighScore：" + pref.getInt("H2HighScore", 0).toString() + "msec"
                    3 -> highScore.text = "HighScore：" + pref.getInt("H3HighScore", 0).toString() + "msec"
                    4 -> highScore.text = "HighScore：" + pref.getInt("H4HighScore", 0).toString() + "msec"
                }
            }
            2 -> {
                when (level) {
                    1 -> highScore.text = "HighScore：" + pref.getInt("VH1HighScore", 0).toString() + "msec"
                    2 -> highScore.text = "HighScore：" + pref.getInt("VH2HighScore", 0).toString() + "msec"
                    3 -> highScore.text = "HighScore：" + pref.getInt("VH3HighScore", 0).toString() + "msec"
                    4 -> highScore.text = "HighScore：" + pref.getString("VH4HighScore", "0msec")
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ゲームの説明
        fun description(gameMode: Int, level: Int) {
            when (gameMode) {
                0 -> {
                    when (level) {
                        1, 2 -> gameDescription.text = "ボタンを全て押せ！"
                        3, 4 -> gameDescription.text = "画像に置き換えたボタンを\n全て押せ！\n(普通のボタンを押すと+100msec)"
                    }
                }
                1 -> {
                    when (level) {
                        1, 2 -> gameDescription.text = "ラジオボタンとチェックボックスを\n全て押せ！"
                        3, 4 -> gameDescription.text = "チェックボックスを全て押せ！\n(ラジオボタンを押すと+200msec)"
                    }
                }
                2 -> {
                    when (level) {
                        1 -> gameDescription.text = "ボタンを全て押せ！"
                        2 -> gameDescription.text = "''ボタン''を全て押せ！"
                        3 -> gameDescription.text = "ラジオボタンを全て押せ！"
                        4 -> gameDescription.text = "ボタンを押すな！"
                    }
                }
            }
        }

        description(gameMode, level)

        // ゲームモードの選択
        radioGroup2.setOnCheckedChangeListener {
            group, checkedId ->
            run {
                when (findViewById<RadioButton>(checkedId).text) {
                    "Normal" -> gameMode = 0
                    "Hard" -> gameMode = 1
                    "Extra" -> gameMode = 2
                }
                description(gameMode, level)
                highScore(gameMode,level)
            }
        }

        // レベルの選択
        levelSeekBar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                       levelText.text = "Level: " + (progress + 1).toString()
                        level = progress + 1
                        description(gameMode, level)
                        highScore(gameMode,level)
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
                }
        )

        // スタートボタンの処理
        fun onStartButtonTapped(view: View?, gameMode: Int, level: Int) {
            val intent: Intent
            val pref = PreferenceManager.getDefaultSharedPreferences(this)

            when(gameMode) {
                0 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, NormalLevel1Activity::class.java)
                            intent.putExtra("N1_HIGHSCORE", pref.getInt("N1HighScore", 0))
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, NormalLevel2Activity::class.java)
                            intent.putExtra("N2_HIGHSCORE", pref.getInt("N2HighScore", 0))
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, NormalLevel3Activity::class.java)
                            intent.putExtra("N3_HIGHSCORE", pref.getInt("N3HighScore", 0))
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, NormalLevel4Activity::class.java)
                            intent.putExtra("N4_HIGHSCORE", pref.getInt("N4HighScore", 0))
                            startActivity(intent)
                        }
                    }
                }
                1 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, HardLevel1Activity::class.java)
                            intent.putExtra("H1_HIGHSCORE", pref.getInt("H1HighScore", 0))
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, HardLevel2Activity::class.java)
                            intent.putExtra("H2_HIGHSCORE", pref.getInt("H2HighScore", 0))
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, HardLevel3Activity::class.java)
                            intent.putExtra("H3_HIGHSCORE", pref.getInt("H3HighScore", 0))
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, HardLevel4Activity::class.java)
                            intent.putExtra("H4_HIGHSCORE", pref.getInt("H4HighScore", 0))
                            startActivity(intent)
                        }
                    }
                }
                2 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, VeryHardLevel1Activity::class.java)
                            intent.putExtra("VH1_HIGHSCORE", pref.getInt("VH1HighScore", 0))
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, VeryHardLevel2Activity::class.java)
                            intent.putExtra("VH2_HIGHSCORE", pref.getInt("VH2HighScore", 0))
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, VeryHardLevel3Activity::class.java)
                            intent.putExtra("VH3_HIGHSCORE", pref.getInt("VH3HighScore", 0))
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, VeryHardLevel4Activity::class.java)
                            intent.putExtra("VH4_HIGHSCORE", pref.getInt("VH4HighScore", 0))
                            startActivity(intent)
                        }
                    }
                }
            }
        }

        startButton.setOnClickListener {
            onStartButtonTapped(it, gameMode, level)
        }

        // 画面を閉じるボタンの処理
        gameEndButton.setOnClickListener {
            finish()
        }

        // ハイスコアをクリアするボタンの処理
        /*highScoreClearButton.setOnClickListener {
            intent = Intent(this, HighScoreClearActivity::class.java)
            startActivity(intent)
        }
        */

        invisibleStageButton.setOnClickListener {
            val intent2 = Intent(this, InvisibleLevelActivity::class.java)
            startActivity(intent2)
        }
    }

    override fun onStart() {
        super.onStart()
        highScore(gameMode,level)
    }

    override fun onRestart() {
        super.onRestart()
        highScore(gameMode, level)
    }

}
