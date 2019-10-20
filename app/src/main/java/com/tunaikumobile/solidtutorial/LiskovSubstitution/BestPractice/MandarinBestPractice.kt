package com.tunaikumobile.solidtutorial.LiskovSubstitution.BestPractice

import java.lang.RuntimeException

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class MandarinBestPractice {
    fun greet(): String {
        throw RuntimeException("I can't speak Mandarin")
    }
}