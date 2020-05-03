package com.tunaikumobile.solidtutorial.liskovSubstitution.bestPractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R

class LSBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        // Programmer isn't forced to extends talkToCustomer() Method anymore
        val work: Work = Programmer()
        work.doWork()
    }
}
