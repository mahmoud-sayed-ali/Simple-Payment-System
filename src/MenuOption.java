
public interface MenuOption {
  public MenuOptionProcessor getProcessorComponent();

  public MenuOptionReader getReaderComponent();

  public void setOptionOrder(int order);

  public int getOptionOrder();
}
