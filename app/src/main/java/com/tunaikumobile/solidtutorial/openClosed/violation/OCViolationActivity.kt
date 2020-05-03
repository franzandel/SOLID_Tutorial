package com.tunaikumobile.solidtutorial.openClosed.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_ocviolation.*


class OCViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocviolation)

        val shoesFactory = ShoesFactory()
        tvViolationShoesType.text = shoesFactory.getShoesPrice(ShoesBrand.NIKE).toString()
    }
}
