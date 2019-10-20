package com.tunaikumobile.solidtutorial.LiskovSubstitution.Violation

import com.tunaikumobile.solidtutorial.LiskovSubstitution.Language
import java.lang.RuntimeException

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

// If MandarinViolation can't speak then don't Implement Language
class MandarinViolation : Language {
    override fun greet(): String {
        throw RuntimeException("I can't speak Mandarin")
    }
}