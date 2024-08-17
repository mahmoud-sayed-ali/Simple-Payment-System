
public class AddProductOption implements MenuOption {
  protected int optionOrder;

  public AddProductOption(int optionOrder) {
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
    return "[" + this.getOptionOrder() + "]: Add Product";
  }

  public MenuOptionProcessor getProcessorComponent() {
    return new AddProductOptionProcessor();
  }

  public MenuOptionReader getReaderComponent() {
    return new AddProductOptionReader();
  }
}
