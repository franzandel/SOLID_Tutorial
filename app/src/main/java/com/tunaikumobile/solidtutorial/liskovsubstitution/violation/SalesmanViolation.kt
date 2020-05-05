package com.tunaikumobile.solidtutorial.liskovsubstitution.violation

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class SalesmanViolation : JobsViolation() {

    override fun doWork() {
        println("Working on Selling Goods")
    }

    override fun talkToCustomer() {
        println("I talk to Customer Everyday")
    }
}