import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class MySQLDatabaseManager implements DatabaseManagerInterface {
  private String url = "jdbc:mysql://localhost:3306/payment_system";
  private String username = "root";
  private String password = "root";

  public HashMap<String, Double> fetchfromDatabase(String table, String attr) {
    String query = "select " + attr + " from " + table;
    ResultSet queryResultSet = null;
    HashMap<String, Double> products = new HashMap<String, Double>();

    try {

      Connection sqlConnection = DriverManager.getConnection(url, username, password);
      Statement statement = sqlConnection.createStatement();
      queryResultSet = statement.executeQuery(query);

      while (queryResultSet.next()) {
        products.put(queryResultSet.getString(1), queryResultSet.getDouble(2));
      }

      sqlConnection.close();

    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }

    return products;
  }

  public void writeToDatabase(String table, String attr, String value) {
    // ? It's to be implemented later
  }
}
