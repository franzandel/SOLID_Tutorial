package com.tunaikumobile.solidtutorial.OpenClosed.Violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_ocviolation.*


class OCViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocviolation)

        val array = ArrayList<Any>().apply {
            add(SneakersViolation())
            add(LoafersViolation())
        }

        tvViolationShoesType.text = checkShoes(array)
    }

    // How if there's a new type of shoes?
    private fun checkShoes(shoesType: ArrayList<Any>): String {
        var shoesCollection = ""

        for (type in shoesType) {
            shoesCollection += when (type) {
                is SneakersViolation -> {
                    SneakersViolation().shoutShoesType() + "\n"
                }
                is LoafersViolation -> {
                    LoafersViolation().shoutShoesType() + "\n"
                }
                else -> throw RuntimeException("Shoes Not Found")
            }
        }

        return shoesCollection
    }
}
