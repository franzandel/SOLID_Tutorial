package com.tunaikumobile.solidtutorial.liskovsubstitution.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R


class LSViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        val jobs: Jobs = Programmer()
        jobs.doWork()
        // talkToCustomer() is called, but do nothing 
        jobs.talkToCustomer()
    }
}
