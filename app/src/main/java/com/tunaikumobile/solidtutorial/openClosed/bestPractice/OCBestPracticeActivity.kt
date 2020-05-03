package com.tunaikumobile.solidtutorial.openClosed.bestPractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_ocbest_practice.*

class OCBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocbest_practice)

        val shoes: ShoesBrand = NikeShoes()
        tvShoesType.text = shoes.getShoesPrice().toString()
    }
}
