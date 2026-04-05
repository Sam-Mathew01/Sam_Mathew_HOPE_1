package transaction;

public class Booking {
    private String customerName;
    private int tableNumber;
    private int numberOfPeople;

    public Booking(String customerName, int tableNumber, int numberOfPeople) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.numberOfPeople = numberOfPeople;
    }

    // Getters (Encapsulation)
    public String getCustomerName() {
        return customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void displayBooking() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customerName);
        System.out.println("Table No: " + tableNumber);
        System.out.println("People: " + numberOfPeople);
    }
}