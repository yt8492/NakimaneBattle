package com.yt8492.nakimanebattle.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.activity.BattleActivity
import kotlinx.android.synthetic.main.fragment_register_dialog.*

class RegisterDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater
        val view = inflater?.inflate(R.layout.fragment_register_dialog, null)
        view?.findViewById<Button>(R.id.button_record)?.setOnTouchListener { v, event ->
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
            .setPositiveButton("マッチ開始") { dialog, which ->
                val playerName = view?.findViewById<EditText>(R.id.edit_user_name)?.text.toString()
                if (playerName.isNotBlank()) {
                    val intent = Intent(activity, BattleActivity::class.java)
                    intent.putExtra("PlayerName",playerName)
                    startActivity(intent)
                }
            }
            .setNegativeButton("キャンセル") { dialog, which ->
                dialog.cancel()
            }

        /*ctivity?.let {
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