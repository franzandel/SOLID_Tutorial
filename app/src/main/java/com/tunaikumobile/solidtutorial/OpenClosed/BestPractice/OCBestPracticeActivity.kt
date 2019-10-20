package com.tunaikumobile.solidtutorial.OpenClosed.BestPractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_ocbest_practice.*

class OCBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocbest_practice)

        val array = ArrayList<Shoes>().apply {
            add(Sneakers())
            add(Loafers())
        }

        tvShoesType.text = checkShoes(array)
    }

    private fun checkShoes(shoesType: ArrayList<Shoes>): String {
        var shoesCollection = ""

        // Free of Modification and Extendable for Shoes
        for (type in shoesType) {
            shoesCollection += type.shoutShoesType() + "\n"
        }

        return shoesCollection
    }
}
