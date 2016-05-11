package com.kris.study;

/**
 * Created by Kris on 16/5/11.
 */
abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
