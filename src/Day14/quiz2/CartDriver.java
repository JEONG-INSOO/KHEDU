package Day14.quiz2;
/*
(b) CartDriver 클래스 설계
1. 변수들: 없음

2. 메소드: main 메소드

3.	main 메소드 설계
	변수들
	scart: ShoppingCart 객체
	itemName: 구매하는 상품의 이름
	itemPrice: 구매하는 상품의 가격
	itemQuantity: 구매하는 상품의 수량
	flag: 상품 추가 여부 확인

	알고리즘
1.	flag = “예”
2.	ShoppingCart 객체를 만든다.
3.	flag = “예”인 동안 다음을 반복한다:
①	구매하는 상품의 이름 이름, 가격과 수량을 입력 받는다.
②	장바구니에 입력 받은 상품을 추가한다.
③	추가할 상품이 있는지 요청하고 사용자 입력 값을  flag에 저장한다.
4.	총 결제액을 출력한다.
*/

import java.util.Scanner;

public class CartDriver {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  ShoppingCart scart = null;
  String itemName = null;
  int itemPrice = 0;
  int itemQuantity = 0;

  String flag = "예";

  scart = new ShoppingCart(5);
  do {

      System.out.print("상품의 이름 >");
      itemName = scanner.nextLine();
      System.out.print("상품의 가격 >");
      itemPrice = Integer.parseInt(scanner.nextLine());
      System.out.print("상품의 수량 >");
      itemQuantity =  Integer.parseInt(scanner.nextLine());
      scart.addToCart(itemName, itemPrice, itemQuantity);
      System.out.print("추가할 상품이 있으십니까? 예/아니오");
      flag = scanner.nextLine();

  } while (flag.equals("예"));

    System.out.println("총 결제액 : " + scart.getTotalPrice());
  }
 }

