
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterfaceMenu {
  ArrayList<MenuOption> menuOptions = new ArrayList<MenuOption>(10);
  Scanner scanner = new Scanner(System.in);
  int optionResult;

  public UserInterfaceMenu() {
    optionResult = 0;
  }

  /**
   * @apiNote This method is for developers who want to add a new option to the
   *          main menu.
   * @param newOption
   * @return void
   */
  public void addOption(MenuOption newOption) {
    menuOptions.add(newOption.getOptionOrder() -1 ,newOption);
  }

  /**
   * @apiNote This menthod is the entry point for the program menu.
   *          It represents all the options available in it.
   * @param None
   * @return void
   */
  public void begin() {
    System.out.println("Welcome to the payment panel, please choose one of the actions below:");

    do {
      System.out.println("\n********************\n");

      menuOptions.forEach((option) -> {
        System.out.println(option);
      });

      System.out.print("\nOption > ");

      int choise = scanner.nextInt();

      menuOptions.get(choise - 1).getReaderComponent().readInput();
      optionResult = menuOptions.get(choise - 1).getProcessorComponent().processInput();

    } while (optionResult != -1);
  }
}
