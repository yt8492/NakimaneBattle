package com.yt8492.nakimanebattle.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.MotionEvent
import android.widget.Toast
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.activity.BattleActivity
import kotlinx.android.synthetic.main.fragment_register_dialog.view.*

class RegisterDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        activity?.let {
            val inflater = it.layoutInflater
            val view = inflater.inflate(R.layout.fragment_register_dialog, null)
            view.button_record.setOnTouchListener { v, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        Toast.makeText(v.context, "録音開始", Toast.LENGTH_SHORT).show()
                    }
                    MotionEvent.ACTION_UP -> {
                        Toast.makeText(v.context, "録音終了", Toast.LENGTH_SHORT).show()
                    }
                }
                false
            }
            builder.setView(view)
                .setTitle("プレイヤー情報")
                .setPositiveButton("マッチ開始") { _, _ ->
                    val playerName = view.edit_user_name.text.toString()
                    if (playerName.isNotBlank()) {
                        val intent = Intent(activity, BattleActivity::class.java)
                        intent.putExtra("PlayerName",playerName)
                        startActivity(intent)
                    }
                }
                .setNegativeButton("キャンセル") { dialog, _ ->
                    dialog.cancel()
                }
        }
        /*activity?.let {
            val recorder = MediaRecorder()
            recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
            recorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT)
            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT)
            val fileName = "record.wav"
            val file = File(it.cacheDir, fileName)
            recorder.setOutputFile(file.absolutePath)
            recorder.prepare()
            button_record.setOnTouchListener { v, event ->
                if (event.action == MotionEvent.ACTION_DOWN) {
                    recorder.start()
                } else if (event.action == MotionEvent.ACTION_UP) {
                    recorder.stop()
                }
                false
            }
        }*/
        return builder.create()
    }
}