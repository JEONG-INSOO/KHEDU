package Day11.quiz34;
import java.lang.*;
/*
3.	Circle 클래스 설계
변수
	radius: 원의 반지름

메소드들
	getRadius: 원의 반지름을 반환한다
	computeArea: 원의 면적을 계산한다
	computePerimeter: 원의 둘레를 계산한다
	setRadius: 원의 반지름을 주어진 값으로 변경한다

*/
public class Circle extends Object{
    //원의 반지름
    private double radius;

    Circle(){               //dafault 생성자
        super();            //상위클래스의 생성자호출
    }


//    double pi = 3.14;
    //	getRadius: 원의 반지름을 반환한다
    public double getRadius() {
        return radius;
    }

    //	computeArea: 원의 면적을 계산한다
    public double computeArea() {       //
        double Area =  (Math.PI*(radius*radius));
        return Area;
    }

    //	computePerimeter: 원의 둘레를 계산한다
    public double computePerimeter() {
        double Perimeter = (2*Math.PI*radius);
        return Perimeter;
    }

    //	setRadius: 원의 반지름을 주어진 값으로 변경한다
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
