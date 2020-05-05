package com.tunaikumobile.solidtutorial.interfacesegregation.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_interface_segregation.*

class ISViolationActivity : AppCompatActivity(), ISViolationOnClickListener {

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

    override fun onLongClick() {
        // This method is not used, but is forced to be implemented
    }
}