package com.tunaikumobile.solidtutorial.DependencyInversion.Violation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_dependency_inversion.*

class DIViolationActivity : AppCompatActivity() {

    // How if you want to change dollarViolation into RupiahViolation?
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

    private fun setUI() {
        tvMyMoney.text = dollarViolation.currency() + "5.000"
    }
}