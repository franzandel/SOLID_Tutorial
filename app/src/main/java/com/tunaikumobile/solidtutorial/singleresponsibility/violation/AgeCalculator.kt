package com.tunaikumobile.solidtutorial.singleresponsibility.violation

import java.util.*

/**
 * Created by Franz Andel on 28/05/20.
 * Android Engineer
 */

class AgeCalculator {
    private val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    fun calculate(birthYear: Int): String {
        return (currentYear - birthYear).toString()
    }

    fun isValid(birthYear: Int): Boolean {
        return currentYear > birthYear
    }
}