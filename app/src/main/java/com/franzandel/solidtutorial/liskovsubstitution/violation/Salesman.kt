package com.franzandel.solidtutorial.liskovsubstitution.violation

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class Salesman : Jobs {

    override fun doWork() {
        println("Working on Selling Goods")
    }

    fun talkToCustomer() {
        println("I talk to Customer Everyday")
    }
}