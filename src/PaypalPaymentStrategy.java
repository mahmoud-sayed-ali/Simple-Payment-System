
public class PaypalPaymentStrategy implements PaymentStrategyInterface {
  @Override
  public void processPayment(PaymentCart paymentCard) {
    System.out.println(
        "Your payment with Paypal has been successfully processed, with a total of: $" + paymentCard.getTotalPrice());
  }
}
