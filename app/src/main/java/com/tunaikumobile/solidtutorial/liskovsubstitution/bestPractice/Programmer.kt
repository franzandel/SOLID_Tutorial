package com.tunaikumobile.solidtutorial.liskovsubstitution.bestPractice

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class Programmer : Jobs {

    override fun doWork() {
        println("Working on Software Development Project")
    }

    override fun talkToCustomer() {
        println("I seldom talk to Customer")
    }
}