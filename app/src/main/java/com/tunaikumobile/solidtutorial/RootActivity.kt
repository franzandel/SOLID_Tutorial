package com.tunaikumobile.solidtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.dependencyInversion.bestPractice.DIBestPracticeActivity
import com.tunaikumobile.solidtutorial.dependencyInversion.violation.DIViolationActivity
import com.tunaikumobile.solidtutorial.interfaceSegregation.bestPractice.ISBestPracticeActivity
import com.tunaikumobile.solidtutorial.interfaceSegregation.violation.ISViolationActivity
import com.tunaikumobile.solidtutorial.liskovSubstitution.bestPractice.LSBestPracticeActivity
import com.tunaikumobile.solidtutorial.liskovSubstitution.violation.LSViolationActivity
import com.tunaikumobile.solidtutorial.openClosed.bestPractice.OCBestPracticeActivity
import com.tunaikumobile.solidtutorial.openClosed.violation.OCViolationActivity
import com.tunaikumobile.solidtutorial.singleResponsibility.bestPractice.SRBestPracticeActivity
import com.tunaikumobile.solidtutorial.singleResponsibility.violation.SRViolationActivity
import kotlinx.android.synthetic.main.activity_root.*

class RootActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_root)

        setupUIClickListener()
    }

    private fun setupUIClickListener() {
        btnSRPBestPractice.setOnClickListener {
            goTo(SRBestPracticeActivity::class.java)
        }

        btnSRPViolation.setOnClickListener {
            goTo(SRViolationActivity::class.java)
        }

        btnOCPBestPractice.setOnClickListener {
            goTo(OCBestPracticeActivity::class.java)
        }

        btnOCPViolation.setOnClickListener {
            goTo(OCViolationActivity::class.java)
        }

        btnLSPBestPractice.setOnClickListener {
            goTo(LSBestPracticeActivity::class.java)
        }

        btnLSPViolation.setOnClickListener {
            goTo(LSViolationActivity::class.java)
        }

        btnISPBestPractice.setOnClickListener {
            goTo(ISBestPracticeActivity::class.java)
        }

        btnISPViolation.setOnClickListener {
            goTo(ISViolationActivity::class.java)
        }

        btnDIPBestPractice.setOnClickListener {
            goTo(DIBestPracticeActivity::class.java)
        }

        btnDIPViolation.setOnClickListener {
            goTo(DIViolationActivity::class.java)
        }
    }
}
