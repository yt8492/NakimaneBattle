package com.yt8492.nakimanebattle.activity

import android.databinding.DataBindingUtil
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.data.Mode
import com.yt8492.nakimanebattle.databinding.ActivityBattleBinding
import com.yt8492.nakimanebattle.fragment.VoiceRecordDialogFragment
import com.yt8492.nakimanebattle.mocks.battle.BattleManager
import com.yt8492.nakimanebattle.mocks.battle.Player
import com.yt8492.nakimanebattle.mocks.battle.PokemonType
import java.io.File

class BattleActivity : AppCompatActivity(), VoiceRecordDialogFragment.VoiceReceiver, BattleManager.BattleStatusIndicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityBattleBinding>(this, R.layout.activity_battle)
        val player1Name = intent.getStringExtra("player1Name")
        val player2Name = intent.getStringExtra("player2Name")
        val battleManager = BattleManager("normal", "normal")
        binding.player1Name = player1Name
        binding.player2Name = player2Name
        binding.player1Hp = battleManager.pl1Hp
        binding.player2Hp = battleManager.pl2Hp
        binding.player1Type = battleManager.pl1Type.name
        binding.player2Type = battleManager.pl2Type.name
        binding.setPlayer1Rec {
            val dialog = VoiceRecordDialogFragment()
            val bundle = Bundle()
            bundle.putSerializable("mode", Mode.PLAYER1)
            bundle.putString("playerName", player1Name)
            dialog.arguments = bundle
            dialog.show(supportFragmentManager, localClassName)
        }
        binding.setPlayer2Rec {
            val dialog = VoiceRecordDialogFragment()
            val bundle = Bundle()
            bundle.putSerializable("mode", Mode.PLAYER2)
            bundle.putString("playerName", player2Name)
            dialog.arguments = bundle
            dialog.show(supportFragmentManager, localClassName)
        }
    }

    override fun receive(file: File) {
        Toast.makeText(this, file.name + file.extension, Toast.LENGTH_SHORT).show()
    }

    override fun update(player: com.yt8492.nakimanebattle.mocks.battle.Player?) {

    }
}
