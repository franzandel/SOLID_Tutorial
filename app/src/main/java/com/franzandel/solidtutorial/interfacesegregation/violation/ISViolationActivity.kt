package com.franzandel.solidtutorial.interfacesegregation.violation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.R
import kotlinx.android.synthetic.main.activity_interface_segregation.*

class ISViolationActivity : AppCompatActivity(), OnClickListener {

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

    override fun onLongClick() {
        // This function is not used, but is forced to be implemented
    }
}