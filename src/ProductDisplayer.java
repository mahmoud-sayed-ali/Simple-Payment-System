
import java.util.ArrayList;

public class ProductDisplayer {
  public static void displayProducts(ArrayList<Product> productList) {
    if (productList.isEmpty()) {
      System.out.println("Empty Card!");
    } else {
      productList.forEach((product) -> {
        System.out.println("- " + product.getName());
      });
    }
  }

  public static void displayProductsDetails(ArrayList<Product> productList) {
    if (productList.isEmpty()) {
      System.out.println("Empty Card!");
    } else {
      productList.forEach((product) -> {
        System.out.println("- " + product.getName() + "\t($" + product.getPrice() + ")");
      });
    }
  }
}
