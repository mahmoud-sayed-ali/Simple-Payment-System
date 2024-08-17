public final class DBMSModel {
  private static DatabaseManagerInterface dbmsManager;

  public static DatabaseManagerInterface getDbmsManager() {
    return dbmsManager;
  }

  public static void setDbmsManager(DatabaseManagerInterface dbmsManager) {
    DBMSModel.dbmsManager = dbmsManager;
  }
}
