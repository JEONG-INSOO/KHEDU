package Day12.Complex;
/*
변수들
	realPart: 실수부의 값
	imaginaryPart: 허수부의 값

메소드들
	생성자메소드: 실수부와 허수부의 값을 각각 0.0으로 초기화하는 Complex 객체를 생성한다
	생성자메소드: 실수부와 허수부의 값을 주어진 값들로 초기화하는 Complex 객체를 생성한다
	print: 복소수를 (a, b)의 형태로 출력한다
	subtract: 한  복소수에서 다른 복소수를 뺀다
	getReal: 실수부의 값을 반환한다
	getImaginary: 허수부의 값을 반환한다
*/

public class Complex {
    private double realPart;        // 실수부의 값
    private double imaginaryPart;   // 허수부의 값

    //	생성자메소드: 실수부와 허수부의 값을 각각 0.0으로 초기화하는 Complex 객체를 생성한다
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    //	생성자메소드: 실수부와 허수부의 값을 주어진 값들로 초기화하는 Complex 객체를 생성한다
    public Complex(){
        super();
    }

    //	print: 복소수를 (a, b)의 형태로 출력한다
    public void print() {
        System.out.printf("(%.2f,%.2f) ", realPart, imaginaryPart);
    }

    //	subtract: 한  복소수에서 다른 복소수를 뺀다
    public Complex subtract(Complex complex1, Complex complex2) {
        double realPart = complex1.getRealPart() - complex2.getRealPart();
        double imagenaryPart = complex1.getImaginaryPart() - complex2.getImaginaryPart();
        Complex complex = new Complex(realPart, imaginaryPart);
        return complex;
    }

    //	getReal: 실수부의 값을 반환한다

    public double getRealPart() {
        return realPart;
    }

    //	getImaginary: 허수부의 값을 반환한다

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
