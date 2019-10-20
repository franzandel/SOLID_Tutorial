package com.tunaikumobile.solidtutorial.DependencyInversion.BestPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    private fun setUI() {
        tvMyMoney.text = moneyConversion.currency() + "5.000"
    }
}
