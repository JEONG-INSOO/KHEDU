package Day11.exam5;
/*
(b) 클래스 설계
1.	필요한 클래스: DieDriver
2.	DieDriver 클래스 설계
	변수들: 없음
	메소드: main 메소드
3.	main 메소드 설계

변수들
	i: 반복문 제어 변수
	face1: 첫 번째 주사위의 값
	face2: 두 번째 주사위의 값
	sum: 주사위 숫자들의 합
	count: 주사위 숫자들의 합이 7이나 11이 나온 횟수
	d1, d2: Die 객체 변수 이름

알고리즘
1.	count = 0
2.	d1 = 첫 번째 Die 객체
3.	d2 = 두 번째 Die 객체
4.	다음을 100번 반복한다:
①	face1  = 첫 번째 Die 객체를 던진 후 나온 값
②	face2  = 두 번째 Die 객체를 던진 후 나온 값
③	sum = face1 + face2
④	sum이 7이거나 11이면 count 값을 1만큼 증가시킨다
5. count 값을 출력한다

*/

public class diceDriver {
    //	메소드: main 메소드
    public static void main(String[] args) {
        int face1 = 0;
        int face2 = 0;
        int sum = 0;
        int count= 0;
        dice d1 = new dice();
        dice d2 = new dice();
        //	i: 반복문 제어 변수 //4.	다음을 100번 반복한다:
        for (int i = 0; i < 100; i++) {
            face1 = d1.roll();          //	face1: 첫 번째 주사위의 값
            face2 = d2.roll();          //	face2: 두 번째 주사위의 값
           //③	sum = face1 + face2
            sum = face1 + face2;        //③	sum = face1 + face2
            if (sum == 7 || sum == 11) {
                count= count + 1;}      //	count: 주사위 숫자들의 합이 7이나 11이 나온 횟수
        }
        //5. count 값을 출력한다
        System.out.println("count의 값은 " + count);
    }
    }

