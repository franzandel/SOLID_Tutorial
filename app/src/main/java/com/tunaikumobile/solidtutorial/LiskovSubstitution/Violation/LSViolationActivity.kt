package com.tunaikumobile.solidtutorial.LiskovSubstitution.Violation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.LiskovSubstitution.Language
import com.tunaikumobile.solidtutorial.R
import kotlinx.android.synthetic.main.activity_liskov_substitution.*


class LSViolationActivity : AppCompatActivity() {

    lateinit var language: Language

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liskov_substitution)

        // If MandarinViolation can't speak then don't Implement Language
        language = MandarinViolation()

        tvLanguage.text = language.greet()
    }
}
