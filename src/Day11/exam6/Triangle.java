package Day11.exam6;
/*
6.	(a) Triangle 클래스 설계
   변수들
	side1: 삼각형의 첫 번째 변의 길이
	side2: 삼각형의 두 번째 변의 길이
	side3: 삼각형의 세 번째 변의 길이

메소드들
	생성자 메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Triangle 객체를 생성한다
	is_right: 삼각형이 직각삼각형인지를 알려 준다
	is_isosceles: 삼각형이 이등변삼각형인지를 알려 준다
*/

public class Triangle {
    public int side1;          //	side1: 삼각형의 첫 번째 변의 길이
    public int side2;          //	side2: 삼각형의 첫 번째 변의 길이
    public int side3;          //	side3: 삼각형의 첫 번째 변의 길이

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String isRight() {
        return "직각삼각형 입니다.";
    }

    public String isIsosceles() {
        return "이등변삼각형입니다.";
    }
}
