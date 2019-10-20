package com.tunaikumobile.solidtutorial.SingleResponsibility.Violation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class SRViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUINotSRP()
    }

    private fun setupUINotSRP() {
        tvName.text = "Franz"
        // Contains Logic
        tvAge.text = (Calendar.getInstance().get(Calendar.YEAR) - 1999).toString()
    }
}
