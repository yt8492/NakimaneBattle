package com.yt8492.nakimanebattle.activity

import android.databinding.DataBindingUtil
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.data.Mode
import com.yt8492.nakimanebattle.data.Player
import com.yt8492.nakimanebattle.databinding.ActivityBattleBinding
import com.yt8492.nakimanebattle.fragment.VoiceRecordDialogFragment
import java.io.File

class BattleActivity : AppCompatActivity(), VoiceRecordDialogFragment.VoiceReceiver {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityBattleBinding>(this, R.layout.activity_battle)
        val player1Name = intent.getStringExtra("player1Name")
        val player2Name = intent.getStringExtra("player2Name")
        val player1 = Player(player1Name)
        val player2 = Player(player2Name)
        binding.player1Name = player1.name
        binding.player2Name = player2.name
        binding.player1Hp = player1.hp
        binding.player2Hp = player2.hp
        binding.setPlayer1Rec {
            val dialog = VoiceRecordDialogFragment()
            val bundle = Bundle()
            bundle.putSerializable("mode", Mode.PLAYER1)
            bundle.putString("playerName", player1.name)
            dialog.arguments = bundle
            dialog.show(supportFragmentManager, localClassName)
        }
        binding.setPlayer2Rec {
            val dialog = VoiceRecordDialogFragment()
            val bundle = Bundle()
            bundle.putSerializable("mode", Mode.PLAYER2)
            bundle.putString("playerName", player2.name)
            dialog.arguments = bundle
            dialog.show(supportFragmentManager, localClassName)
        }
    }

    override fun receive(file: File) {
        Toast.makeText(this, file.name + file.extension, Toast.LENGTH_SHORT).show()
    }
}
