package twob;

public class CashPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CashPayment();
    }
}
