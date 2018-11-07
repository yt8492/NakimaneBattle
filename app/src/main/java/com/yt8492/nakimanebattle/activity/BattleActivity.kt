package com.yt8492.nakimanebattle.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yt8492.nakimanebattle.R
import kotlinx.android.synthetic.main.activity_battle.*
import java.util.*

class BattleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle)
        Log.d("hoge", "start")
        val playerName = intent.getStringExtra("PlayerName")
        text_view_user_name.text = "Player Name : $playerName"
    }
}
