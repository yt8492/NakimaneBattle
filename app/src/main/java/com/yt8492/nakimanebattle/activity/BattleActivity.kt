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
import kotlin.random.Random

class BattleActivity : AppCompatActivity(), VoiceRecordDialogFragment.VoiceReceiver, BattleManager.BattleStatusIndicator {
    private val battleManager by lazy { BattleManager("normal", "normal") }
    private var player1Type: String? = null
    private var player2Type: String? = null
    private val pokemonTypeArray = arrayOf(
        "normal",
        "water",
        "fire",
        "electric",
        "grass",
        "ice",
        "martial",
        "poison",
        "ground",
        "flying",
        "esper",
        "insect",
        "rock",
        "ghost",
        "dragon",
        "evil",
        "steel",
        "fairy"
    )
    private lateinit var binding: ActivityBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_battle)
        battleManager.setIndicator(this)
        val player1Name = intent.getStringExtra("player1Name")
        val player2Name = intent.getStringExtra("player2Name")
        binding.player1Name = "Player1: $player1Name"
        binding.player2Name = "Player2: $player2Name"
        binding.player1Hp = "HP: ${battleManager.pl1Hp}"
        binding.player2Hp = "HP: ${battleManager.pl2Hp}"
        binding.player1Type = "タイプ: ${battleManager.pl1Type.name}"
        binding.player2Type = "タイプ: ${battleManager.pl2Type.name}"
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

    override fun receive(file: File, mode: Mode) {
        when (mode) {
            Mode.PLAYER1 -> {
                player1Type = pokemonTypeArray[Random.nextInt(pokemonTypeArray.size)]
                if (!player2Type.isNullOrBlank()) {
                    battleManager.Update(player1Type, player2Type)
                }
            }
            Mode.PLAYER2 -> {
                player2Type = pokemonTypeArray[Random.nextInt(pokemonTypeArray.size)]
                if (!player1Type.isNullOrBlank()) {
                    battleManager.Update(player1Type, player2Type)
                }
            }
        }
    }

    override fun update(mode: Mode, player: Player) {
        when (mode) {
            Mode.PLAYER1 -> {
                binding.player1Hp = "HP: ${player.HP()}"
                binding.player1Type = "タイプ: ${player.Type().name}"
                player1Type = null
            }
            Mode.PLAYER2 -> {
                binding.player2Hp = "HP: ${player.HP()}"
                binding.player2Type = "タイプ: ${player.Type().name}"
                player2Type = null
            }
        }
    }
}
