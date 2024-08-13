package twob;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using PayPal.");
    }
}
