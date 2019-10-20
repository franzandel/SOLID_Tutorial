package com.tunaikumobile.solidtutorial.LiskovSubstitution

import android.util.Log

/**
 * Created by Franz Andel on 2019-10-18.
 * Android Engineer
 */

class English : Language {
    override fun greet(): String {
        return "Hello from English"
    }
}