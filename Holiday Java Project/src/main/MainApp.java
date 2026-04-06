package main;

import processor.BookingProcessor;
import transaction.Booking;
import payment.*;

public class MainApp {
    public static void main(String[] args) {
        BookingProcessor processor = new BookingProcessor();
        Booking booking = processor.createBooking("Sam", 5, 3);
        if (booking != null) {
            booking.displayBooking();
            Payment payment;
            payment = new CardPayment(500);
            payment.pay();
            // payment = new CashPayment(500);
        }
    }
}
