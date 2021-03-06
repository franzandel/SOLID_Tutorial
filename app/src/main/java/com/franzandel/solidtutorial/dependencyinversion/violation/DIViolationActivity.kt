package com.franzandel.solidtutorial.dependencyinversion.violation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.R
import kotlinx.android.synthetic.main.activity_dependency_inversion.*

class DIViolationActivity : AppCompatActivity() {

    // How if you want to change dollarViolation into RupiahViolation
    // while dollarViolation is used in many places?
    private lateinit var dollar: Dollar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependency_inversion)

        setConversion(Dollar())
        setUI()
    }

    private fun setConversion(dollar: Dollar) {
        this.dollar = dollar
    }

    @SuppressLint("SetTextI18n")
    private fun setUI() {
        tvMyMoney.text = "${dollar.currency()}5.000"
    }
}