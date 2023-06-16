package Day2;

import java.util.Scanner;

public class RockGAME {
  public static void main(String[] args) {
    // 컴퓨터 값 랜덤 추출
    int com = (int)(Math.random() * 3) + 1;

    // 사용자 값 입력
    Scanner scanner = new Scanner(System.in);
    System.out.print("가위 (1) , 바위 (2) , 보 (3) 선택 :");
    String value1 = scanner.nextLine();
    int user = Integer.valueOf(value1);

    // 판단
    System.out.println("컴퓨터의 선택: " + com);
    int result; // user 기준 0: 비김 1: 이김 2: 짐
    //비김
    if (user == com) {
      result = 0;
      System.out.println("비겼습니다");
    }
    // 이김
    if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2){
      result = 1;
      System.out.println("당신이 이겼습니다.");
      //짐
    } else if (user == 2 && com == 3 || user == 1 && com == 2 || user ==3 && com == 1) {
      result = 2;
      System.out.println("당신이 졌습니다.");
    }
  }
}
//
//    String COMCHOICE =null;
//    switch (COM){
//      case 1:
//        COMCHOICE = "가위";
//        break;
//      case 2:
//        COMCHOICE = "바위";
//        break;
//      case 3:
//        COMCHOICE = "보";
//        break;
//
//    String
//        userCHOICE = null;
//  switch (user){
//      case 1:
//        userCHOICE = "가위";
//        break;
//      case 2:
//        userCHOICE = "바위";
//        break;
//      case 3:
//      userCHOICE = "보";
//      break;
//      System.out.println("컴퓨터 : " + COMCHOICE);
//      System.out.println("나 :" + userCHOICE);        switch (result) {
//        case 0: // 비김
//          System.out.println("비겼습니다");
//          break;
//        case 1: // 이김
//          System.out.println("당신이 이겼습니다.");
//          break;
//        case 2: // 짐
//          System.out.println("당신이 졌습니다");
//          break;
//          ;
//      }
//      }
//
//    }