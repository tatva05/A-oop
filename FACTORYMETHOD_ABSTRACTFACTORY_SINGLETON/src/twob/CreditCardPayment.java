package twob;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}
