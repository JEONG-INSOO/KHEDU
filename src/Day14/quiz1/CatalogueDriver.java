package Day14.quiz1;

import java.util.Scanner;

/*
(b) CatalogueDriver 클래스 설계
1. 변수들: 없음

2. 메소드: main 메소드

3.	main 메소드 설계
	변수들
	bcat: BookCatalogue 객체
	bookName: 추가하는 도서의 도서명
	bookAuthor: 추가하는 도서의 저자
	bookPrice: 추가하는 도서의 가격
	flag: 도서 추가 여부 확인

	알고리즘
1.	flag = “예”
2.	BookCatalogue 객체를 만든다.
3.	flag = “예”인 동안 다음을 반복한다:
①	추가하는 도서의 도서명, 저자와 가격을 입력 받는다.
②	도서목록에 입력 받은 도서를 추가한다.
③	추가할 도서가 있는지 요청하고 사용자 입력 값을  flag에 저장한다.
4.	BookCatalogue 객체의 내용을 출력한다.
*/
public class CatalogueDriver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BookCatalogue bcat = null;
    String bookName = null;
    String bookAuthor = null;
    int bookPrice = 0;

    String flag = "예";

    bcat = new BookCatalogue();

    do {
      System.out.print("도서명 >>");
      bookName = scanner.nextLine();
      System.out.print("저자 >");
      bookAuthor = scanner.nextLine();
      System.out.print("도서가격 >");
      bookPrice =  Integer.parseInt(scanner.nextLine());

      bcat.addToCatalogue(bookName, bookAuthor, bookPrice);

      System.out.print("도서를 추가하시겠습니까? (예/아니오)");
      flag = scanner.nextLine();

    } while (flag.equals("예"));

    System.out.println(bcat);
  }
}
