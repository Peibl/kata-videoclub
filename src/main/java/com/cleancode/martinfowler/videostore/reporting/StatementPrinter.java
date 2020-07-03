package com.cleancode.martinfowler.videostore.reporting;

import com.cleancode.martinfowler.videostore.Customer;
import com.cleancode.martinfowler.videostore.Rental;

public class StatementPrinter {
    public String print(Customer customer) {
        double totalAmount = customer.getRentals().stream().mapToDouble(Rental::getPrice).sum();
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
        for (Rental rental : customer.getRentals()) {
            double moviePrice = rental.getPrice();
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(moviePrice).append("\n");
        }
        result.append("You owed ").append(totalAmount).append("\n");
        result.append("You earned ").append(customer.getFrequentRenterPoints()).append(" frequent renter points\n");
        return result.toString();
    }
}
