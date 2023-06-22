package Day11.quiz56;

public class RectangleDriver {
/*
6.	RectangleDriver 클래스의 main 메소드 설계
변수들
	rec: Rectangle 객체 참조변수
	area: 직사각형의 면적
	perm: 직사각형의 둘레

알고리즘
(1)	Rectangle 객체를 만들어 rec가 가리키게 한다.
(2)	rec의 가로를 3.0으로 변경한다.
(3)	rec의 세로를 5.0으로 변경한다.
(4)	rec의 면적을 구하여 area에 저장한다.
(5)	rec의 둘레를 구하여 perm에 저장한다.
(6)	rec의 가로, 세로, area와 perm을 출력한다.
*/
public static void main(String[] args) {
    Rectangle rec;        //	rec: Rectangle 객체 참조변수
    double area = 0;                        //	area: 직사각형의 면적
    double perm = 0;                        //	perm: 직사각형의 둘레

    //(1)	Rectangle 객체를 만들어 rec가 가리키게 한다.
    rec = new Rectangle();
    //(2)	rec의 가로를 3.0으로 변경한다.
    rec.setLength(3.0);
    //(3)	rec의 세로를 5.0으로 변경한다.
    rec.setWidth(5.0);
    //(4)	rec의 면적을 구하여 area에 저장한다.
    area = rec.calculateArea();
    //(5)	rec의 둘레를 구하여 perm에 저장한다.
    perm = rec.calculatePerimeter();
    //(6)	rec의 가로, 세로, area와 perm을 출력한다.
    System.out.println("rec의 가로 : " + rec.getLength());
    System.out.println("rec의 세로 : " + rec.getWidth());
    System.out.println("rec의 넓이 : " + area);
    System.out.println("rec의 둘레 : " + perm);
}
}
