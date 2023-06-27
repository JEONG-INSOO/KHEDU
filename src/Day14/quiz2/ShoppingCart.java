package Day14.quiz2;
/*
9.	(a) ShoppingCart 클래스 설계
1.	변수들
	cart: Item 객체들의 배열
	capacity: 장바구니의 최대 크기
	itemCount: 장바구니에 있는 Item 객체들의 총수
	totalPrice: 장바구니에 있는  상품들의 총 가격

2.	메소드
	생성자메소드: 크기가 5인 비어 있는 장바구니를 만든다
	addToCart: 장바구니에 한 Item 객체를 추가한다
	toString: 장바구니의 상태를 문자열로 반환한다
	getTotalPrice: 장바구니에 있는  상품들의 총 가격을 반환한다
*/

import java.util.Arrays;

public class ShoppingCart {
  private item[] cart = null;
  private int capacity = 0;
  private int itemCount = 0;
  private int totalPrice = 0;

  public ShoppingCart(int capacity) {
    cart = new item[5];
  }

  public void addToCart(String itemName, int itemPrice, int itemQuantity) {
    cart[itemCount] = new item(itemName, itemPrice, itemQuantity);
    totalPrice += itemPrice*itemQuantity;
    itemCount++;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
        "cart=" + Arrays.toString(cart) +
        ", capacity=" + capacity +
        ", itemCount=" + itemCount +
        ", totalPrice=" + totalPrice +
        '}';
  }
}
