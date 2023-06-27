package Day14.quiz1;

import java.util.Arrays;

/*
8.	(a) BookCatalogue 클래스 설계
1.	변수들
	catalogue: Book 객체들의 배열
	capacity: 도서목록의 최대 크기
	bookCount: 도서목록에 있는 책들의 총수

2.	메소드
	생성자메소드: 크기가 10인 비어 있는 도서목록을 만든다
	addToCatalogue: 도서목록에 한 Book 객체를 추가한다
	toString: 도서목록의 상태를 문자열로 반환한다
*/
public class BookCatalogue {
  private Book[] catalogue;
  private final int CAPACITY = 10;
  private int bookcount;

  public BookCatalogue() {
    catalogue = new Book[CAPACITY];
  }

  public void addToCatalogue(String bookName, String bookAuthor, int bookPrice
  ) {
    Book book = new Book(bookName, bookAuthor, bookPrice);
    catalogue[bookcount] = book;
    bookcount++;
  }

  @Override
  public String toString() {
    return "BookCatalogue{" +
        "catalogue=" + Arrays.toString(catalogue) +
        ", capacity=" + CAPACITY +
        ", bookcount=" + bookcount +
        '}';
  }
}
