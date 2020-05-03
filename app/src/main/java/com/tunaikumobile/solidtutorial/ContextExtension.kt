package com.tunaikumobile.solidtutorial

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

fun <T : AppCompatActivity> Context.goTo(clazz: Class<T>) {
    Intent(this, clazz).run {
        startActivity(this)
    }
}