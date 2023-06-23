package Day11.exam6;
/*
(b) 설계
1. 필요한 클래스: TriangleDriver
2. TriangleDriver 클래스 설계
	변수들: 없음
	메소드: main 메소드
3. main 메소드 설계
변수들
	triangle1: 첫 번째 Triangle 객체 참조 변수
	triangle2: 두 번째 Triangle 객체 참조 변수
	triangle3: 세 번째 Triangle 객체 참조 변수

알고리즘
1.	triangle1 = 세 변의 길이가 각각 3, 5, 7인 Triangle 객체
2.	triangle2 = 세 변의 길이가 각각 3, 4, 5인 Triangle 객체
3.	triangle3 = 세 변의 길이가 각각 7, 10, 7인 Triangle 객체
4.	triangle1이 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
5.	Triangle2가 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
6.	Triangle3가 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.

*/

public class TriangleDriver {
    //	메소드: main 메소드
    public static void main(String[] args) {
        Triangle triangle1;           //	triangle1: 첫 번째 Triangle 객체 참조 변수
        Triangle triangle2;           //	triangle2: 두 번째 Triangle 객체 참조 변수
        Triangle triangle3;           //	triangle3: 세 번째 Triangle 객체 참조 변수

        triangle1 = new Triangle(3,5,7);            //1.	triangle1 = 세 변의 길이가 각각 3, 5, 7인 Triangle 객체
        triangle2 = new Triangle(3,4,5);            //2.	triangle2 = 세 변의 길이가 각각 3, 4, 5인 Triangle 객체
        triangle3 = new Triangle(7,10,7);           //3.	triangle3 = 세 변의 길이가 각각 7, 10, 7인 Triangle 객체

        int a, b, c;
        //4.	triangle1이 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
        while (true) {
            a = triangle1.side1;
            b = triangle1.side2;
            c = triangle1.side3;

            if ( a == b || b == c || c == a) {
                System.out.println(triangle1.isIsosceles());
                break;
            } else if (a * a + b * b == c * c) {
                System.out.println(triangle1.isRight());
                break;
            } else if (a * a + c * c == b * b) {
                System.out.println(triangle1.isRight());
                break;
            } else if (b * b + c * c == a * a) {
                System.out.println(triangle1.isRight());
                break;
            } else
                System.out.println("이등변 삼각형, 직각삼각형에 해당하지 않습니다.");
                break;
        }//5.	triangle2이 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
        while (true) {
            a = triangle2.side1;
            b = triangle2.side2;
            c = triangle2.side3;

            if (a == b || b == c || c == a){
                System.out.println(triangle2.isIsosceles());
                break;
            }else if (a * a + b * b == c * c) {
                System.out.println(triangle2.isRight());
                break;
            } else if (a * a + c * c == b * b) {
                System.out.println(triangle2.isRight());
                break;
            } else if (b * b + c * c == a * a) {
                System.out.println(triangle2.isRight());
                break;
            } else
                System.out.println("이등변 삼각형, 직각삼각형에 해당하지 않습니다.");
                break;
        }//6.	triangle3이 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다. 아니면  이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘 다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
        while (true) {
            a = triangle3.side1;
            b = triangle3.side2;
            c = triangle3.side3;

            if (a == b || b == c || c == a){
                System.out.println(triangle3.isIsosceles());
                break;
            }else if (a * a + b * b == c * c) {
                System.out.println(triangle3.isRight());
                break;
            } else if (a * a + c * c == b * b) {
                System.out.println(triangle3.isRight());
                break;
            } else if (b * b + c * c == a * a) {
                System.out.println(triangle3.isRight());
                break;
            } else
                System.out.println("이등변 삼각형, 직각삼각형에 해당하지 않습니다.");
                break;
        }
    }
}
