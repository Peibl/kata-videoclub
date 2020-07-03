package com.cleancode.martinfowler.videostore.pricing;

public class RegularMoviePriceCalculator implements MoviePriceCalculator {
    public double calculate(int daysRented) {
        double moviePrice = 2;
        if (daysRented > 2) moviePrice += (daysRented - 2) * 1.5;
        return moviePrice;
    }
}
