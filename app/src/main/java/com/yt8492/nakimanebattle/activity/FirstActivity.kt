package com.yt8492.nakimanebattle.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yt8492.nakimanebattle.R
import com.yt8492.nakimanebattle.fragment.RegisterDialogFragment
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    val fragmentManager by lazy { supportFragmentManager }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        button.setOnClickListener {
            val dialog = RegisterDialogFragment()
            dialog.show(fragmentManager, RegisterDialogFragment::class.java.simpleName)
        }
    }
}
