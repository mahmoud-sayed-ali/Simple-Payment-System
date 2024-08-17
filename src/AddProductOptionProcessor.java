
public class AddProductOptionProcessor implements MenuOptionProcessor {
  protected PaymentCart shoppingCart = new PaymentCart();

  public int processInput() {

    for (String productName : AddProductOptionReader.getProductsArray()) {
      AddProductOptionReader.getProductList().forEach((product) -> {
        if (product.getName().toLowerCase().compareTo(productName) == 0) {
          shoppingCart.addProduct(product);
        }
      });
    }

    ShoppingCartProvider.addToShoppingCart(shoppingCart);

    if (!shoppingCart.getProductList().isEmpty()) {
      System.out.println("\nThe following products are added to the shopping cart successfully:");
      ProductDisplayer.displayProductsDetails(shoppingCart.getProductList());
      System.out.println("\n Total credit: " + shoppingCart.getTotalPrice());
    } else {
      System.out.println("The shopping cart is empty.");
    }

    /*
     * Clear the product list to prevent redundancy.
     */
    AddProductOptionReader.getProductList().clear();

    return 0;
  }
}
