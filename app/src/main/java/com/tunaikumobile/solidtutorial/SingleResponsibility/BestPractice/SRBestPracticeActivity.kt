package com.tunaikumobile.solidtutorial.SingleResponsibility.BestPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class SRBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUIWithSRP()
    }

    private fun setupUIWithSRP() {
        tvName.text = "Franz"
        // No Logic only Showing Result
        tvAge.text = Utils().countAge(1999)
    }
}
