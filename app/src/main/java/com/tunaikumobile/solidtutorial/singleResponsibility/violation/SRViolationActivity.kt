package com.tunaikumobile.solidtutorial.singleResponsibility.violation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class SRViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUINotSRP()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUINotSRP() {
        tvName.text = "Franz"
        // Contains Logic
        tvAge.text = (Calendar.getInstance().get(Calendar.YEAR) - 1999).toString()
    }
}
