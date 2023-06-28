package Day15.exec1.quiz1;
/*
MonetaryCoinDriver 클래스 설계
1. 변수들: 없음

2. 메소드: main 메소드

1.	main 메소드 설계
	변수들
	coins: MonetaryCoin 객체들의 배열
	sum: 동전 값들의 합

	알고리즘
1.	MonetaryCoin 객체들의 배열을 만든다.
2.	다른 금액의 MonetaryCoin 객체들을 만든다.
3.	모든 동전들을 던진다
4.	sum = 0
5.	동전 값들의 합을 구하여 sum에 저장한다
6.	동전들의 현 상태를 출력한다
7.	동전 값들의 합을 출력한다.
*/

public class MonetaryCoinDriver {
  public static void main(String[] args) {
    MonetaryCoin[] coins = null;    //	coins: MonetaryCoin 객체들의 배열
    int sum = 0;                    //	sum: 동전 값들의 합

    coins = new MonetaryCoin[4];
    coins[0] = new MonetaryCoin(10);
    coins[1] = new MonetaryCoin(50);
    coins[2] = new MonetaryCoin(100);
    coins[3] = new MonetaryCoin(500);

    for (int i = 0; i < coins.length; i++) {
      coins[i].flip();
    }
    for (int i = 0; i < coins.length; i++) {
      sum += coins[i].getValue();
    }
    for (int i = 0; i < coins.length; i++) {
      System.out.println(coins[i].getValue() + "원인 동전의 상태 : " + coins[i].facetoString());
    }
    System.out.println("동전의 합 " + sum);
  }
}
