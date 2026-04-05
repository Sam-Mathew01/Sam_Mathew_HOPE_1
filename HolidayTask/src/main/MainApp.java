package main;

import processor.BookingProcessor;
import transaction.Booking;
import payment.*;

public class MainApp {

    public static void main(String[] args) {

        BookingProcessor processor = new BookingProcessor();

        // Create booking
        Booking booking = processor.createBooking("Sam", 5, 3);

        if (booking != null) {
            booking.displayBooking();

            // Extra Feature: Payment
            Payment payment;

            // Polymorphism (deciding at runtime)
            payment = new CardPayment(500);
            payment.pay();

            // You can also try:
            // payment = new CashPayment(500);
        }
    }
}
