package com.cleancode.martinfowler.videostore.pricing;

import com.cleancode.martinfowler.videostore.Movie;

public class MoviePriceCalculatorFactory {
    public MoviePriceCalculator create(int priceCode) {
        switch (priceCode) {
            default:
                return new RegularMoviePriceCalculator();
            case Movie.NEW_RELEASE:
                return new NewReleaseMoviePriceCalculator();
            case Movie.CHILDREN:
                return new ChildrenMoviePriceCalculator();
        }
    }
}
