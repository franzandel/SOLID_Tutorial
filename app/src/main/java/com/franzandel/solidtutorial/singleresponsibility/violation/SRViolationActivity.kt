package com.franzandel.solidtutorial.singleresponsibility.violation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.R
import kotlinx.android.synthetic.main.activity_main.*

class SRViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUINotSRP()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUINotSRP() {
        val ageCalculator = AgeCalculator()
        val birthYear = 2000

        if (ageCalculator.isValid(birthYear)) {
            tvName.text = "Franz"
            tvAge.text = ageCalculator.calculate(birthYear)
        }
    }
}
