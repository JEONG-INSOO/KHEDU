package Day4;

public class Exam5 {
  public static void main(String[] args) {

    int[] coinUnit = {500, 100, 50, 10};
    int[] coinCnt = {5, 5, 5, 5};
    int money = 2680;
    System.out.println("money = " + money);

    for (int i = 0; i < coinUnit.length; i++) {

      // 1) 필요 동전 갯수 구하기
      int coinNum = money / coinUnit[i];

      // 2) 남은 동전 갯수 구하기
      if (coinCnt[i] >= coinNum) {
        coinCnt[i] -= coinNum;
      } else {
        coinNum = coinCnt[i];
        coinCnt[i] = 0;
      }

      // 3) 거스름돈 잔액
      money = money - coinNum * coinUnit[i];                    // 800 = 3300 - 2500

      System.out.println(coinUnit[i] + "원:" + coinNum);
    }
    if (money > 0) {
      System.out.println("거스름돈 부족");
      System.exit(0); //프로그램 종료
    }

    //남은 동전 갯수
    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원:" + (coinCnt[i]));
      money = money % coinUnit[i]; // money %= coinUnit[i];
    }
  }
}

