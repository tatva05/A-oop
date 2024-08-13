package twob;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using Cash.");
    }
}
