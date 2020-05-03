package com.tunaikumobile.solidtutorial.singleResponsibility.bestPractice

import java.util.*

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class AgeHelper {
    fun countAge(birthYear: Int): String {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        return (currentYear - birthYear).toString()
    }
}