package com.tunaikumobile.solidtutorial.openclosed.violation

/**
 * Created by Franz Andel on 01/05/20.
 * Android Engineer
 */

class ShoesFactory {

    // How if there's a new brand of shoes?
    // If there are 10 ShoesBrand with Complex Calculation in it, this class will be very Complex
    fun getShoesPrice(shoesBrand: ShoesBrand): Int {
        return when (shoesBrand) {
            ShoesBrand.NIKE -> 2000
            ShoesBrand.ADIDAS -> 1500
        }
    }
}