package Day4;
/*
  자판기 거스름돈 계산
  동전 = 500, 100, 50, 10
  모든 동전이 각 5개씩 있다고 가정할 때,
    보유한 동전이 부족하면 "거스름 돈이 부족합니다" 출력
    보유한 동전이 충분하면 거스름 돈을 내어주고 남은 동전의 개수를 화면에 출력하시오.
*/

public class Exam4 {
  public static void main(String[] args) {
    int[] coinUnit = {500,100,50,10};
    //case 1)
    //int[] coinUnit = new int[]{500,100,50,10};

    //case 2)
    //int[] coinUnit = new int[5];
    //coinUnit[0] = 500; coinUnit[1] = 100; coinUnit[2] = 50; coinUnit[3] = 10;

    int money = 2_680;
    System.out.println("money = " + money);

    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원:" + (money / coinUnit[i]));
      money = money % coinUnit[i];              //money %= coinUnit[i];
    }
    System.out.println(money);

    //  money = 2680
    //  500원 : 5 < = 2500원
    //  100원 : 1 < = 2600원
    //  50원  : 1 < = 2650원
    //  10원  : 3 < = 2680원

  }
}