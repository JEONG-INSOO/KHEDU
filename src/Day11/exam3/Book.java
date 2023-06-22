package Day11.exam3;
/*
3.	Book 클래스 설계
 변수들
	title: 도서명
	author: 저자
	price: 가격

메소드들
	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Book 객체를 생성한다
	getTitle: 도서명을 반환한다
	getAuthor: 저자를 반환한다
	getPrice: 가격을 반환한다
	setTitle: 도서명을 주어진 값으로 변경한다
	setAuthor: 저자를 주어진 값으로 변경한다
	setPrice: 가격을 주어진 값으로 변경한다
	toString: 도서의 현 상태를 반환한다.
*/

public class Book {
    private String title;       //	title: 도서명
    private String author;      //	author: 저자
    private int price;          //	price: 가격
    //	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Book 객체를 생성한다
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //	getTitle: 도서명을 반환한다
    public String getTitle() {
        return title;
    }
    //	setTitle: 도서명을 주어진 값으로 변경한다
    public void setTitle(String title) {
        this.title = title;
    }
    //	getAuthor: 저자를 반환한다
    public String getAuthor() {
        return author;
    }
    //	setAuthor: 저자를 주어진 값으로 변경한다
    public void setAuthor(String author) {
        this.author = author;
    }
    //	getPrice: 가격을 반환한다
    public int getPrice() {
        return price;
    }
    //	setPrice: 가격을 주어진 값으로 변경한다
    public void setPrice(int price) {
        this.price = price;
    }
    //	toString: 도서의 현 상태를 반환한다.
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
