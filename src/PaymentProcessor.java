
public class PaymentProcessor {
  private PaymentStrategyInterface paymentStrategy;

  public PaymentProcessor(PaymentStrategyInterface paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void processPayment(PaymentCart paymentCard) {
    paymentStrategy.processPayment(paymentCard);
    System.out.println("Your Payment Products:");
    ProductDisplayer.displayProductsDetails(paymentCard.getProductList());
  }
}
