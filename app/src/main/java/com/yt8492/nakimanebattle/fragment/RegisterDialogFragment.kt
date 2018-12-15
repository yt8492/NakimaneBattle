package com.yt8492.nakimanebattle.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.activity.BattleActivity
import kotlinx.android.synthetic.main.fragment_register_dialog.view.*

class RegisterDialogFragment : DialogFragment() {

    private var listener: DialogListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        activity?.let {
            val inflater = it.layoutInflater
            val view = inflater.inflate(R.layout.fragment_register_dialog, null)
            builder.setView(view)
                .setTitle("プレイヤー情報")
                .setPositiveButton("対戦開始") { _, _ ->
                    val player1Name = view.edit_player_name_1.text.toString()
                    val player2Name = view.edit_player_name_2.text.toString()
                    if (player2Name.isNotBlank() && player2Name.isNotBlank()) {
                        listener?.regist(player1Name, player2Name)
                    }
                }
                .setNegativeButton("キャンセル") { dialog, _ ->
                    dialog.cancel()
                }
        }
        return builder.create()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is DialogListener) {
            listener = context
        } else {
            throw IllegalStateException()
        }
    }

    interface DialogListener {
        fun regist(player1Name: String, player2Name: String)
    }
}