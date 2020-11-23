package com.franzandel.solidtutorial.singleresponsibility.bestPractice

import java.util.*

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class AgeCalculator {
    fun calculate(birthYear: Int): String {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        return (currentYear - birthYear).toString()
    }
}