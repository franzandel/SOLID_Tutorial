package com.franzandel.solidtutorial.liskovsubstitution.bestPractice

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class Salesman : Jobs {

    override fun doWork() {
        println("Working on Selling Goods")
    }

    override fun talkToCustomer() {
        println("I talk to Customer Everyday")
    }
}