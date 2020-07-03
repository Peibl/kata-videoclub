package com.cleancode.martinfowler.videostore.pricing;

public interface MoviePriceCalculator {
    double calculate(int daysRented);
}
