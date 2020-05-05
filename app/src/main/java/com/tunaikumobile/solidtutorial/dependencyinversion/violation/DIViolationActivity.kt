package com.tunaikumobile.solidtutorial.dependencyinversion.violation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_dependency_inversion.*

class DIViolationActivity : AppCompatActivity() {

    // How if you want to change dollarViolation into RupiahViolation
    // while dollarViolation is used in many places?
    private lateinit var dollarViolation: DollarViolation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependency_inversion)

        setConversionViolation(DollarViolation())
        setUI()
    }

    private fun setConversionViolation(dollarViolation: DollarViolation) {
        this.dollarViolation = dollarViolation
    }

    @SuppressLint("SetTextI18n")
    private fun setUI() {
        tvMyMoney.text = "${dollarViolation.currency()}5.000"
    }
}