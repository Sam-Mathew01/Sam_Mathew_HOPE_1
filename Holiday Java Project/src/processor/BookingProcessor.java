package processor;

import transaction.Booking;
import utils.Validator;

public class BookingProcessor {

    public Booking createBooking(String name, int table, int people) {
        try {
            Validator.validatePeople(people);
            Validator.validateTable(table);

            Booking booking = new Booking(name, table, people);
            System.out.println("Booking Successful!");
            return booking;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
