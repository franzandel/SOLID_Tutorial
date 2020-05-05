package com.tunaikumobile.solidtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.solidtutorial.dependencyinversion.bestPractice.DIBestPracticeActivity
import com.tunaikumobile.solidtutorial.dependencyinversion.violation.DIViolationActivity
import com.tunaikumobile.solidtutorial.interfacesegregation.bestPractice.ISBestPracticeActivity
import com.tunaikumobile.solidtutorial.interfacesegregation.violation.ISViolationActivity
import com.tunaikumobile.solidtutorial.liskovsubstitution.bestPractice.LSBestPracticeActivity
import com.tunaikumobile.solidtutorial.liskovsubstitution.violation.LSViolationActivity
import com.tunaikumobile.solidtutorial.openclosed.bestPractice.OCBestPracticeActivity
import com.tunaikumobile.solidtutorial.openclosed.violation.OCViolationActivity
import com.tunaikumobile.solidtutorial.singleresponsibility.bestPractice.SRBestPracticeActivity
import com.tunaikumobile.solidtutorial.singleresponsibility.violation.SRViolationActivity
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
