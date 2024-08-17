
public class Main {
  public static void main(String[] args) {
    UserInterfaceMenu ui = new UserInterfaceMenu();

    /*
     * Create and add all the default options to the menu list.
     */
    MenuOption addProductOption = new AddProductOption(1);
    MenuOption processPaymentOption = new ProcessPaymentOption(2);
    MenuOption exitProgramOption = new ExitProgramOption(3);

    ui.addOption(addProductOption);
    ui.addOption(processPaymentOption);
    ui.addOption(exitProgramOption);

    /*
     * Create the database manager instance and assign it to the DBMSModel class
     */
    DatabaseManagerInterface DatabaseModel = new MySQLDatabaseManager();
    DBMSModel.setDbmsManager(DatabaseModel);

    /*
     * Begin the console UI
     */
    ui.begin();

    /*
     * TODO list:
     */
        // TODO: Add a section to the Console UI that tracks the shopping cart
        // TODO: Add a user registration/login features
  }
}
