package com.tunaikumobile.solidtutorial.DependencyInversion.Violation

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class RupiahViolation {

    fun currency(): String {
        return "Rp."
    }

    fun isCurrencyValid(): Boolean {
        return true
    }
}