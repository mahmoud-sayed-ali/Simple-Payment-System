public class ExitProgramOption implements MenuOption {
  private int optionOrder;

  public ExitProgramOption(int optionOrder) {
    this.optionOrder = optionOrder;
  }

  public void setOptionOrder(int order) {
    this.optionOrder = order;
  }

  public int getOptionOrder() {
    return this.optionOrder;
  }

  @Override
  public String toString() {
    return "[" + this.getOptionOrder() + "]: Exit";
  }

  public MenuOptionProcessor getProcessorComponent() {
    return new ExitProgramOptionProcessor();
  }

  public MenuOptionReader getReaderComponent() {
    return new ExitProgramOptionReader();
  }
}
