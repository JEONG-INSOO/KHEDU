package Day11.quiz34;
/*
4.	CircleDriver 클래스의 main 메소드 설계
변수들
	cir: Circle 객체 참조변수
	area: 원의 면적
	perm: 원의 둘레

알고리즘
(1)	Circle 객체를 만들어 cir가 가리키게 한다.
(2)	cir의 반지름을 5.0으로 변경한다.
(3)	cir의 면적을 구하여 area에 저장한다.
(4)	cir의 둘레를 구하여 perm에 저장한다.
(5)	area와 perm을 출력한다.
*/
    public class CircleDriver {
    public static void main(String[] args) {
    Circle cir;     //	cir: Circle 객체 참조변수
    double area;    //	area: 원의 면적
    double perm;    //	perm: 원의 둘레

    //(1)	Circle 객체를 만들어 cir가 가리키게 한다.
    cir = new Circle();
    //(2)	cir의 반지름을 5.0으로 변경한다.
    cir.setRadius(5.0);
    //(3)	cir의 면적을 구하여 area에 저장한다.
    area = cir.computeArea();
    //(4)	cir의 둘레를 구하여 perm에 저장한다.
    perm = cir.computePerimeter();
    //(5)	area와 perm을 출력한다.
    System.out.printf("원의 넓이 : %.2f \t 원의 둘레 : %.2f ", area, perm);
        System.out.println();
        System.out.println(cir.toString());
    }
}
