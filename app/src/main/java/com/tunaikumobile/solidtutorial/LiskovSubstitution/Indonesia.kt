package com.tunaikumobile.solidtutorial.LiskovSubstitution

import android.util.Log

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class Indonesia : Language {
    override fun greet(): String {
        return "Halo dari Indonesia"
    }
}