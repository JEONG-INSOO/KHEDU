package Day13.quiz1;
/*
1.	CalculateAverage 클래스 설계
1.	변수들: 없음

2.	메소드: main 메소드

3.	main 메소드 설계
	변수들
	scores: 정수들의 배열
	sum: 합
	average: 평균

	알고리즘
1.	sum = 0
2.	다음을 10번 반복한다:
①	정수를 읽어 들인다.
②	sum = sum + 읽어 들인 정수
3.	average = sum / 10
4.	sum과 average를 출력한다.

*/

import java.util.Scanner;

public class CalculateAverage {
  public static void main(String[] args) {
    int[] scores = null;       //	scores: 정수들의 배열
    int sum = 0;          //	sum: 합
    double average = 0.0;      //	average: 평균
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("a의 값을 입력하세요: ");
      a = scanner.nextInt();
      scores = new int[]{sum += a};
      average = sum / 10;
      System.out.println("정수의 합은 ? " + sum);
      System.out.println("정수의 평균은? " + average);
    }
  }
}
