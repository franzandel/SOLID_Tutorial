package com.franzandel.solidtutorial.singleresponsibility.bestPractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*

class SRBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUIWithSRP()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUIWithSRP() {
        val birthYear = 2000

        if (AgeValidator().isValid(birthYear)) {
            tvName.text = "Franz"
            tvAge.text = AgeCalculator().calculate(birthYear)
        }
    }
}
