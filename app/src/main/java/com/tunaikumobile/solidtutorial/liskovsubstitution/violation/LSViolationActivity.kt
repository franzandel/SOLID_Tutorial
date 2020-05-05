package com.tunaikumobile.solidtutorial.liskovsubstitution.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R


class LSViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        // Programmer doesn't talk to Customer, but is forced to extends talkToCustomer() Method
        val jobsViolation: JobsViolation = ProgrammerViolation()
        jobsViolation.doWork()
        jobsViolation.talkToCustomer()
    }
}
