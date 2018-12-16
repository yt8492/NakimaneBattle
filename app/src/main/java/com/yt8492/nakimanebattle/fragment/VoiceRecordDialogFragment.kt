package com.yt8492.nakimanebattle.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.databinding.DataBindingUtil
import android.media.MediaRecorder
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.Toast
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.data.Mode
import com.yt8492.nakimanebattle.databinding.FragmentRecordDialogBinding
import java.io.File

class VoiceRecordDialogFragment : DialogFragment() {
    private var listener: VoiceReceiver? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val binding = DataBindingUtil.inflate<FragmentRecordDialogBinding>(LayoutInflater.from(activity),
            R.layout.fragment_record_dialog, null, false)
        val view = binding.root
        val playerName = arguments?.getString("playerName") ?: ""
        binding.playerName = playerName
        val mode = arguments?.getSerializable("mode") as Mode
        val recorder = MediaRecorder()
        val file = File.createTempFile("rec", "voice", context?.cacheDir)
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
        recorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT)
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT)
        recorder.setOutputFile(file.absolutePath)
        binding.recordVoice.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    recorder.prepare()
                    recorder.start()
                }
                MotionEvent.ACTION_UP -> {
                    recorder.stop()
                    recorder.release()
                }
            }
            false
        }
        builder.setView(view)
            .setPositiveButton("OK") { dialogInterface, i ->
                listener?.receive(file, mode)
                dialogInterface.cancel()
            }
        return builder.create()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is VoiceReceiver) {
            listener = context
        }
    }

    interface VoiceReceiver {
        fun receive(file: File, mode: Mode)
    }
}