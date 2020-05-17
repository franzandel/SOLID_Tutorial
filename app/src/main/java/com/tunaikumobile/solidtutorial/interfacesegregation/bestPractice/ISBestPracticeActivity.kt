package com.tunaikumobile.solidtutorial.interfacesegregation.bestPractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_interface_segregation.*

// Make a Smaller Interface, so Child Class can choose which Interface to be Implemented
class ISBestPracticeActivity : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface_segregation)

        btnChangeName.setOnClickListener {
            onClick()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick() {
        tvName.text = "Franz Andel"
    }
}