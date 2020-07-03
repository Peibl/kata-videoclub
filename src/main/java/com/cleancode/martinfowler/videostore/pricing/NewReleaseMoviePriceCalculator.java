package com.cleancode.martinfowler.videostore.pricing;

public class NewReleaseMoviePriceCalculator implements MoviePriceCalculator {
    public double calculate(int daysRented) {
        return daysRented * 3;
    }
}
