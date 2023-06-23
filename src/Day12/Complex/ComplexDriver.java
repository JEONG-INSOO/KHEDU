package Day12.Complex;
/*
클래스 설계
A. 필요한 클래스: ComplexDriver
B. ComplexDriver  클래스 설계
	변수들: 없음
	메소드: main 메소드

C. main 메소드 설계
변수들
	x, y, z: 복소수 객체
알고리즘
1.	2 + 3i를 나타내는 복소수 객체 x를 생성한다.
2.	-3 + 7i를 나타내는 복소수 객체 y를 생성한다.
3.	z = x – y
4.	x, y, z를 출력한다

*/
public class ComplexDriver {
    public static void main(String[] args) {
        Complex x =null, y=null, z=null;

        x = new Complex(2, 3);
        y = new Complex(-3, 7);
        z = new Complex();
        z = z.subtract(x, y);

        x.print();
        y.print();
        z.print();

    }
}
