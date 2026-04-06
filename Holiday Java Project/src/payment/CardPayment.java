package payment;

public class CardPayment extends Payment {

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paid " + amount + " using Card.");
    }
}
