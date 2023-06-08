package Day1;

import java.util.Scanner;

public class Exam5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("국어점수 : ");
    int kor = Integer.valueOf(scanner.nextLine());
    System.out.print("영어점수 : ");
    int eng = Integer.valueOf(scanner.nextLine());
    System.out.print("수학점수 : ");
    int math = Integer.valueOf(scanner.nextLine());

    int sum = kor + eng + math; // 점수 총계
    double avg = (double)sum/3; // 점수 평균

//    System.out.println("국어점수: " + kor);
//    System.out.println("영어점수: " + eng);
//    System.out.println("수학점수: " + math);
    System.out.println("점수총계: " + sum);
    System.out.println("점수평균: " + avg);

  }
}
