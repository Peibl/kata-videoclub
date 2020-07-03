package com.cleancode.martinfowler.videostore;

import com.cleancode.martinfowler.videostore.reporting.StatementPrinter;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        return new StatementPrinter().print(this);
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints++;
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE
                    && rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }
}

