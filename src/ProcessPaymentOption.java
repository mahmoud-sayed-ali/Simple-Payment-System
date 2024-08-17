
public class ProcessPaymentOption implements MenuOption {
  protected int optionOrder;

  public ProcessPaymentOption(int optionOrder) {
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
    return "[" + this.getOptionOrder() + "]: Process Payment";
  }

  public MenuOptionProcessor getProcessorComponent() {
    return new ProcessPaymentOptionProcessor();
  }

  public MenuOptionReader getReaderComponent() {
    return new ProcessPaymentOptionReader();
  }
}