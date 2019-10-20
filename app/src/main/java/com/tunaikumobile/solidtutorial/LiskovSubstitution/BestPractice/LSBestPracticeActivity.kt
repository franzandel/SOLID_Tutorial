package com.tunaikumobile.solidtutorial.LiskovSubstitution.BestPractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_liskov_substitution.*


class LSBestPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        // Don't force object to extend from Interface
        val mandarinBestPractice = MandarinBestPractice()

        tvLanguage.text = mandarinBestPractice.greet()
    }
}
