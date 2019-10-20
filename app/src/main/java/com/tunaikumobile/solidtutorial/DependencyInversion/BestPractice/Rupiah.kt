package com.tunaikumobile.solidtutorial.DependencyInversion.BestPractice

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class Rupiah: MoneyConversion {

    override fun currency(): String {
        return "Rp."
    }
}