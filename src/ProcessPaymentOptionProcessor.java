
public class ProcessPaymentOptionProcessor implements MenuOptionProcessor {
  private PaymentProcessor paymentProcessor;

  public ProcessPaymentOptionProcessor() {
    this.paymentProcessor = new PaymentProcessor(new VisaPaymentStrategy());
    // ? You would get the strategy from: User.getPaymemtStrategy()
  }

  public int processInput() {
    if (ProcessPaymentOptionReader.getConfirmation().compareTo("yes") == 0) {
      if (!ShoppingCartProvider.getShoppingCart().getProductList().isEmpty()) {
        paymentProcessor.processPayment(ShoppingCartProvider.getShoppingCart());
        ShoppingCartProvider.getShoppingCart().getProductList().clear();
      } else {
        System.out.println("You can't proceed while your shopping cart is empty.");
      }
    } else if (ProcessPaymentOptionReader.getConfirmation().compareTo("no") == 0) {
      System.out.println("Process cancelled.");
    } else {
      System.err.println("Err: Invalid input. You should enter either yes or no.");
    }
    return 0;
  }
}
