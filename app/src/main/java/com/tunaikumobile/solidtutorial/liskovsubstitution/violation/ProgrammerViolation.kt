package com.tunaikumobile.solidtutorial.liskovsubstitution.violation

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class ProgrammerViolation : JobsViolation() {

    override fun doWork() {
        println("Working on Software Development Project")
    }

    override fun talkToCustomer() {

    }
}