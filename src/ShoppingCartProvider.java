
public class ShoppingCartProvider {
  private static PaymentCart paymentCart = new PaymentCart();

  public static void addToShoppingCart(PaymentCart paymentCart) {
    for (Product product : paymentCart.getProductList()) {
      ShoppingCartProvider.paymentCart.addProduct(product);
    }
  }

  public static void setShoppingCart(PaymentCart paymentCart) {
    ShoppingCartProvider.paymentCart = paymentCart;
  }

  public static PaymentCart getShoppingCart() {
    return paymentCart;
  }
}
