package twob;

public class RideSharingApp {

    public static void main(String[] args) {
        // User Authentication
        UserAuth userAuth = UserAuth.getInstance();
        userAuth.login("JohnDoe");

        // Create different vehicles using the Factory Method
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory scooterFactory = new ScooterFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();
        Vehicle scooter = scooterFactory.createVehicle();

        // Book vehicles
        car.book();
        bike.book();
        scooter.book();

        // Create different payment methods using the Abstract Factory
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentFactory paypalFactory = new PayPalPaymentFactory();
        PaymentFactory cashFactory = new CashPaymentFactory();

        PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
        PaymentMethod paypal = paypalFactory.createPaymentMethod();
        PaymentMethod cash = cashFactory.createPaymentMethod();

        // Make payments
        creditCard.pay();
        paypal.pay();
        cash.pay();

        // Logout user
        userAuth.logout();
    }
}
