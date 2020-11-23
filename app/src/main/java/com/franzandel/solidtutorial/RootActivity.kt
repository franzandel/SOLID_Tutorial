package com.franzandel.solidtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.franzandel.solidtutorial.dependencyinversion.bestPractice.DIBestPracticeActivity
import com.franzandel.solidtutorial.dependencyinversion.violation.DIViolationActivity
import com.franzandel.solidtutorial.interfacesegregation.bestPractice.ISBestPracticeActivity
import com.franzandel.solidtutorial.interfacesegregation.violation.ISViolationActivity
import com.franzandel.solidtutorial.liskovsubstitution.bestPractice.LSBestPracticeActivity
import com.franzandel.solidtutorial.liskovsubstitution.violation.LSViolationActivity
import com.franzandel.solidtutorial.openclosed.bestPractice.OCBestPracticeActivity
import com.franzandel.solidtutorial.openclosed.violation.OCViolationActivity
import com.franzandel.solidtutorial.singleresponsibility.bestPractice.SRBestPracticeActivity
import com.franzandel.solidtutorial.singleresponsibility.violation.SRViolationActivity
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
