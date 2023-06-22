package Day11.quiz56;
import java.lang.*;
/*
5.	Rectangle 클래스 설계
변수들
	length: 가로
	width: 세로

메소드들
	calculateArea: 면적을 계산한다
	calculatePerimeter: 둘레를 계산한다
	getLength: 가로의 길이를 반환한다
	getWidth: 세로의 길이를 반환한다
	setLength: 가로의 길이를 주어진 값으로 변경한다
	setWidth: 세로의 길이를 주어진 값으로 변경한다

*/
public class Rectangle extends Object {
    public Rectangle() {
        super();
    }
    private double length;     //	length: 가로
    private double width;      //	width: 세로

    //	calculateArea: 면적을 계산한다
    public double calculateArea() {
        double area = length*width;
        return area;
    }

    //	calculatePerimeter: 둘레를 계산한다
    public double calculatePerimeter() {
        double perm = 2 * (length + width);
        return perm;
    }
    //	getLength: 가로의 길이를 반환한다
    public double getLength() {
        return length;
    }

    //	getWidth: 세로의 길이를 반환한다
    
    public double getWidth() {
        return width;
    }
    //	setLength: 가로의 길이를 주어진 값으로 변경한다
    public void setLength(double length) {
        if(length <= 0)return;
        this.length = length;
    }
    //	setWidth: 세로의 길이를 주어진 값으로 변경한다
    public void setWidth(double width) {
        if(width <= 0)return;
        this.width = width;
    }
}
