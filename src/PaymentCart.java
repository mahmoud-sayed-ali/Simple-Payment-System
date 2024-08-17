
import java.util.ArrayList;

public class PaymentCart {
  private ArrayList<Product> productList = new ArrayList<Product>();
  private double totalPrice;

  public PaymentCart() {
    this.totalPrice = 0;
  }

  public ArrayList<Product> getProductList() {
    return productList;
  }

  public void addProduct(Product product) {
    if (product != null) {
      productList.add(product);
    }
  }

  public void removeProduct(Product product) {
    productList.remove(product);
  }

  public double getTotalPrice() {
    this.totalPrice = 0;
    if (!productList.isEmpty()) {
      productList.forEach((product) -> {
        this.totalPrice += product.getPrice();
      });
    }
    return totalPrice;
  }
}
