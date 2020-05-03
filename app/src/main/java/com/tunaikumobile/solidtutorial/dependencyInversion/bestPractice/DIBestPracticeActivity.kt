package com.tunaikumobile.solidtutorial.dependencyInversion.bestPractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_dependency_inversion.*

class DIBestPracticeActivity : AppCompatActivity() {

    private lateinit var moneyConversion: MoneyConversion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependency_inversion)

        // It can be easily changed to Rupiah
        setConversion(Dollar())
        setUI()
    }

    private fun setConversion(moneyConversion: MoneyConversion) {
        this.moneyConversion = moneyConversion
    }

    @SuppressLint("SetTextI18n")
    private fun setUI() {
        tvMyMoney.text = "${moneyConversion.currency()}5.000"
    }
}
