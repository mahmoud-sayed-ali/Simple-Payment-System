import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.NoSuchFieldException;

public class AddProductOptionReader implements MenuOptionReader {
  protected static ArrayList<Product> productList = new ArrayList<Product>();
  protected static String[] products = new String[50];

  private Scanner scanner = new Scanner(System.in);
  protected String inputs;

  public void readInput() {
    System.out.println("Choose the products you want to purchase." + '\n' +
        "Here is a list of the Available prroducts:");
    /*
     * Read all available products from the database
     */
    DatabaseManagerInterface dbManager = DBMSModel.getDbmsManager();
    HashMap<String, Double> fetchedProducts = dbManager.fetchfromDatabase("products", "product_name, price");
    try {
      if (fetchedProducts.isEmpty()) {
        throw new NoSuchFieldException("No available products");
      }

      fetchedProducts.forEach((product_name, price) -> {
        productList.add(new Product(product_name, price));
      });

      productList.forEach((product) -> {
        System.out.println("-" + product.getName() + "\t($" + product.getPrice() + ")");
      });

      /*
       * Read the user input. It may contain one or more products, so we need to
       * read the whole line once.
       */
      System.out.print("\nEnter the name of products >> ");

      inputs = scanner.nextLine().toLowerCase();

      // * Split all products in an array
      products = inputs.split(",");

      // * Make sure each product name has no leading and trailing spaces
      int index = 0;
      for (String product : products) {
        products[index] = product.trim();
        index++;
      }

    } catch (Exception exception) {
      System.err.println(exception.getMessage());
    }
  }

  public static ArrayList<Product> getProductList() {
    return AddProductOptionReader.productList;
  }

  public static String[] getProductsArray() {
    return AddProductOptionReader.products;
  }
}
