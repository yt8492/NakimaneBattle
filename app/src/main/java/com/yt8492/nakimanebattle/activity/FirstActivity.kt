package com.yt8492.nakimanebattle.activity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.util.Log
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.fragment.RegisterDialogFragment
import com.yt8492.nakimanebattle.mocks.battle.BattleManager
import com.yt8492.nakimanebattle.mocks.battle.Player
import kotlinx.android.synthetic.main.activity_first.*

const val PERMISSION_CODE = 118
class FirstActivity : AppCompatActivity(), RegisterDialogFragment.DialogListener, BattleManager.BattleStatusIndicator {
    override fun update(player: Player?) {
        Log.d("debug", "Activity updated from callback")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        checkPermission()
        button.setOnClickListener {
            val dialog = RegisterDialogFragment()
            dialog.show(supportFragmentManager, RegisterDialogFragment::class.java.simpleName)
        }

        val battleManager = BattleManager("water", "fire")
        battleManager.setIndicator(this);
        battleManager.PrintCurrentStatus()
        battleManager.Update("fairy", "normal")
        battleManager.PrintCurrentStatus()
    }

    override fun regist(player1Name: String, player2Name: String) {
        val intent = Intent(this, BattleActivity::class.java)
        intent.putExtra("player1Name", player1Name)
        intent.putExtra("player2Name", player2Name)
        startActivity(intent)
    }

    private fun checkPermission() {
        val permissionList = arrayListOf<String>()
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        == PackageManager.PERMISSION_DENIED) {
            permissionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
        == PackageManager.PERMISSION_DENIED) {
            permissionList.add(Manifest.permission.RECORD_AUDIO)
        }
        if (permissionList.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, permissionList.toTypedArray(), PERMISSION_CODE)
        }
    }
}
