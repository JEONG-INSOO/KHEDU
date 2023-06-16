package Day2;

import java.util.Scanner;

/*
 사용자로 부터 3개의 정수를 입력 받아 최대 값을 출력하는 프로그램을 구현하시오.
 */
public class Exam7 {
  public static void main(String[] args) {
    // 입력을 받을 땐 Scanner를 씁니다.
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수1 입력 : ");
    String value1 = scanner.nextLine(); //콘솔상에서 엔터 입력할 때 까지의 값을 문자열로 읽어들임.
    int v1 = Integer.valueOf(value1);    // 문자열을 정수로 변환

    System.out.print("정수2 입력 : ");
    String value2 = scanner.nextLine();
    int v2 = Integer.valueOf(value2);    // 문자열을 정수로 변환

    System.out.print("정수3 입력 : ");
    String value3 = scanner.nextLine();
    int v3 = Integer.valueOf(value3);    // 문자열을 정수로 변환

    int max = v1;
    if (max < v2) {
      max = v2;
    }
    if (max < v3) {
      max = v3;
    }

    System.out.println("최대값 = " + max);
  }
}