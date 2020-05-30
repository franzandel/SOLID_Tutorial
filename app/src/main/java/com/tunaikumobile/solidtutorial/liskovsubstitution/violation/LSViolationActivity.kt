package com.tunaikumobile.solidtutorial.liskovsubstitution.violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R


class LSViolationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

//        This is okay because doWork() is fully supported by Jobs
//        val jobs: Jobs = Programmer()
//        jobs.doWork()

//        This violates the principle, because talkToCustomer() is not supported by Jobs
        val jobs: Jobs = Salesman()
        jobs.doWork()
        if (jobs is Salesman) {
            jobs.talkToCustomer()
        }
    }
}
