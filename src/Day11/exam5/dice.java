package Day11.exam5;
/*
5.	(a) Die 클래스 설계
   변수들
	faceValue: 주사위의 현재 면

메소드들
	생성자메소드: 새로운 Die 객체를 생성한다
	roll: 주사위를 던진 후 나온 값을 반환한다
	getFaceValue: 주사위의 현재 면을 반환한다


*/

public class dice {
    private int faceValue;          //	faceValue: 주사위의 현재 면

    //	생성자메소드: 새로운 Die 객체를 생성한다

    public dice() {
        this.faceValue = faceValue;
    }

    public int roll() {             //	roll: 주사위를 던진 후 나온 값을 반환한다
        faceValue =  (int)(Math.random()*6) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
