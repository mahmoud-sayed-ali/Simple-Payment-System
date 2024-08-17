
public class ExitProgramOptionProcessor implements MenuOptionProcessor {
  public int processInput() {
    return (ExitProgramOptionReader.getConfirmation().compareTo("yes") == 0 ? -1 : 0);
  }
}
