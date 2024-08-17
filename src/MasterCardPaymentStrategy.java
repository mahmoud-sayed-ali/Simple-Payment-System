
public class MasterCardPaymentStrategy implements PaymentStrategyInterface {
  @Override
  public void processPayment(PaymentCart paymentCard) {
    System.out.println("Your payment with MasterCard has been successfully processed, with a total of: $"
        + paymentCard.getTotalPrice());
  }
}
