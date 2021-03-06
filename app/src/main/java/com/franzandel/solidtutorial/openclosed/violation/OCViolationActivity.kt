package com.franzandel.solidtutorial.openclosed.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.R
import kotlinx.android.synthetic.main.activity_ocviolation.*


class OCViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocviolation)

        val shoesFactory = ShoesFactory()
        tvViolationShoesType.text = shoesFactory.getShoesPrice(ShoesBrand.NIKE).toString()
    }
}
