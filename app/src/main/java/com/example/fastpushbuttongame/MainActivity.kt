package com.example.fastpushbuttongame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var gameMode = 0
    private var level = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ゲームの説明
        fun description(gameMode: Int, level: Int) {
            when (gameMode) {
                0 -> {
                    when (level) {
                        1, 2 -> gameDescription.text = "ボタンを全て押せ！"
                        3, 4 -> gameDescription.text = "画像付きボタンを全て押せ！"
                    }
                }
                1 -> {
                    when (level) {
                        1, 2 -> gameDescription.text = "ボタンを全て押せ！"
                        3, 4 -> gameDescription.text = "チェックボックスを全て押せ！"
                    }
                }
                2 -> {
                    when (level) {
                        1, 2 -> gameDescription.text = "ボタンを全て押せ！"
                        3 -> gameDescription.text = "スイッチを全てONにしろ！"
                        4 -> gameDescription.text = "ボタンとラジオボタンを全て押せ！"
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
                    "VeryHard" -> gameMode = 2
                }
                description(gameMode, level)
            }
        }

        // レベルの選択
        levelSeekBar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                       levelText.text = "Level: " + (progress + 1).toString()
                        level = progress + 1
                        description(gameMode, level)
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
                }
        )

        // スタートボタンの処理
        fun onStartButtonTapped(view: View?, gameMode: Int, level: Int) {
            val intent: Intent
            when(gameMode) {
                0 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, NormalLevel1Activity::class.java)
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, NormalLevel2Activity::class.java)
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, NormalLevel3Activity::class.java)
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, NormalLevel4Activity::class.java)
                            startActivity(intent)
                        }
                    }
                }
                1 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, HardLevel1Activity::class.java)
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, HardLevel2Activity::class.java)
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, HardLevel3Activity::class.java)
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, HardLevel4Activity::class.java)
                            startActivity(intent)
                        }
                    }
                }
                2 -> {
                    when(level) {
                        1 -> {
                            intent = Intent(this, VeryHardLevel1Activity::class.java)
                            startActivity(intent)
                        }
                        2 -> {
                            intent = Intent(this, VeryHardLevel2Activity::class.java)
                            startActivity(intent)
                        }
                        3 -> {
                            intent = Intent(this, VeryHardLevel3Activity::class.java)
                            startActivity(intent)
                        }
                        4 -> {
                            intent = Intent(this, VeryHardLevel4Activity::class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }

        startButton.setOnClickListener {
            onStartButtonTapped(it, gameMode, level)
        }

        // ハイスコア
    }
}
