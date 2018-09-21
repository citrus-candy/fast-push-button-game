package com.example.fastpushbuttongame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var gameMode = 0
    private var level = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ゲームモードの選択
        radioGroup2.setOnCheckedChangeListener {
            group, checkedId ->
            run {
                when (findViewById<RadioButton>(checkedId).text) {
                    "Normal" -> gameMode = 0
                    "Hard" -> gameMode = 1
                    "VeryHard" -> gameMode = 2
                }
            }
        }

        // レベルの選択
        levelSeekBar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                       levelText.text = progress.toString()
                        level = progress
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
                }
        )

        // ゲームの説明

        // スタートボタンの処理

        // ハイスコア
    }
}
