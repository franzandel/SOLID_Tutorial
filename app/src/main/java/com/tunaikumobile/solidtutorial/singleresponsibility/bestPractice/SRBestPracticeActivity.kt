package com.tunaikumobile.solidtutorial.singleresponsibility.bestPractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*

class SRBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUIWithSRP()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUIWithSRP() {
        tvName.text = "Franz"
        // No Logic, only Showing Result
        tvAge.text = AgeHelper().countAge(1999)
    }
}
