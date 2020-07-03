package com.cleancode.martinfowler.videostore;

import com.cleancode.martinfowler.videostore.pricing.MoviePriceCalculator;
import com.cleancode.martinfowler.videostore.pricing.MoviePriceCalculatorFactory;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        MoviePriceCalculator priceCalculator = new MoviePriceCalculatorFactory().create(this.getMovie().getPriceCode());
        return priceCalculator.calculate(this.getDaysRented());
    }
}

