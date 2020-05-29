package com.tunaikumobile.solidtutorial.singleresponsibility.bestPractice

import java.util.*

/**
 * Created by Franz Andel on 28/05/20.
 * Android Engineer
 */

class AgeValidator {
    fun isValid(birthYear: Int): Boolean {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        return currentYear > birthYear
    }
}