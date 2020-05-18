package com.tunaikumobile.solidtutorial.singleresponsibility.bestPractice

import java.util.*

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class AgeCalculator {
    fun calculateAge(birthYear: Int): String {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        return (currentYear - birthYear).toString()
    }
}