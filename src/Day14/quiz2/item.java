package Day14.quiz2;

public class item {
  String itemName = null;
  int itemPrice = 0;
  int itemQuantity = 0;

  public item(String itemName, int itemPrice, int itemQuantity) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemQuantity = itemQuantity;
  }

  public String getItemName() {
    return itemName;
  }

  public int getItemPrice() {
    return itemPrice;
  }

  public int getItemQuantity() {
    return itemQuantity;
  }
}

