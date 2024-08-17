import java.util.HashMap;

public interface DatabaseManagerInterface {
  public HashMap<String, Double> fetchfromDatabase(String table, String attr);

  public void writeToDatabase(String table, String attr, String value);
}
