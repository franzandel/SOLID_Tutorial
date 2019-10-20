package com.tunaikumobile.solidtutorial.InterfaceSegregation.BestPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_interface_segregation.*

// Make a Smaller Interface, so Child Class can choose which method is needed
class ISBestPracticeActivity : AppCompatActivity(),
    OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface_segregation)

        btnChangeName.setOnClickListener {
            onClick()
        }
    }

    override fun onClick() {
        tvName.text = "Franz Andel"
    }
}