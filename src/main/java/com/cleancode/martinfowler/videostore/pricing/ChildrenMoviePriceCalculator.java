package com.cleancode.martinfowler.videostore.pricing;

public class ChildrenMoviePriceCalculator implements MoviePriceCalculator {
    public double calculate(int daysRented) {
        double moviePrice = 1.5;
        if (daysRented > 3) moviePrice += (daysRented - 3) * 1.5;
        return moviePrice;
    }
}
