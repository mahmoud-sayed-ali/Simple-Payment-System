
public class VisaPaymentStrategy implements PaymentStrategyInterface {
  @Override
  public void processPayment(PaymentCart paymentCard) {
    System.out.println(
        "Your payment with Visa has been successfully processed, with a total of: $" + paymentCard.getTotalPrice());
  }
}
