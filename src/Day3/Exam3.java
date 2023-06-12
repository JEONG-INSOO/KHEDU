package Day3;

import java.util.Scanner;

/*
사용자로부터 시작값과 종료값을 입력받아 해당구간의 홀수합, 짝수합, 총합을
산출하는 프로그램을 작성하시오. 단, 시작값으로 "X"을 입력하면 프로그램 종료.
ex) 시작 :10
    종료 :100
    짝수합:
    홀수합:
    총합:
*/
public class Exam3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (; ; ) {
      System.out.println("시작 값을 입력하세요.");
      String start = scanner.nextLine();

      if (start.equalsIgnoreCase("X")) {
        break;  // 가장 가까운 반복문을 빠져나온다.
      }
      int num = Integer.parseInt(start);

      System.out.println("종료값을 입력하세요.");
      String finish = scanner.nextLine();
      int num2 = Integer.parseInt(finish);

      System.out.println("시작: " + num);
      System.out.println("종료: " + num2);

      int sum = 0;
      for (int i = num; i <= num2; i++) {
        if (num % 2 == 0) {
          sum += i;
          i += 1;
        }
      }
      System.out.println("짝수합:" + sum);

      for (int i = num; i < num2; i++) {
        if (num % 2 == 1) {
          sum += i;
          i += 1;
        }
      }
      System.out.println("홀수합:" + sum);

      for (int i = num; i < num2; i++) {
          sum += i;
          i += 1;
        }
      System.out.println("총합:" + sum);
    }
    System.out.println("프로그램 종료");
  }
}
