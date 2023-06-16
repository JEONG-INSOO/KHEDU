package Day4;
/*
  main 메소드에 배열넘기기
*/

public class Exam6 {
  public static void main(String[] args) {
    int[] coinUnit = {500,100,50,10};

//    int money = 2_680;

    String tmp = args[2];       // "java" 는 정수화 불가 "123" 가능
    int money = Integer.parseInt(tmp);    //"2680" => 2680
//  int money = Integer.parseInt(args[0]);

    System.out.println("money = " + money);

    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원:" + (money / coinUnit[i]));
      money = money % coinUnit[i];              //money %= coinUnit[i];
    }
    System.out.println(money);

  }
}