package com.tunaikumobile.solidtutorial.liskovsubstitution.bestPractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R

class LSBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        val work: Work = Programmer()
        // Now, we won't find talkToCustomer() Method anymore
        work.doWork()
    }
}
