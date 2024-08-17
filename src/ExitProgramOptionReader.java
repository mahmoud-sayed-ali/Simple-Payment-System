
import java.util.Scanner;

public class ExitProgramOptionReader implements MenuOptionReader {
  private static String confirmation;
  private Scanner scanner = new Scanner(System.in);

  public void readInput() {
    System.out.print("Are you sure you want to exit? ");
    ExitProgramOptionReader.confirmation = scanner.next().toLowerCase();
  }

  public static String getConfirmation() {
    return ExitProgramOptionReader.confirmation;
  }
}
