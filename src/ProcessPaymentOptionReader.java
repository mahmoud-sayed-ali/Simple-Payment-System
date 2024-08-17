
import java.util.Scanner;

public class ProcessPaymentOptionReader implements MenuOptionReader {
  private static String confirmation;
  private Scanner scanner = new Scanner(System.in);

  public void readInput() {
    System.out.print("Are you sure you want to proceed? ");
    ProcessPaymentOptionReader.confirmation = scanner.next().toLowerCase();
  }

  public static String getConfirmation() {
    return ProcessPaymentOptionReader.confirmation;
  }
}
