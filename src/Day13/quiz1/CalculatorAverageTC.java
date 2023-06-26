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

public class CalculatorAverageTC {
  public static void main(String[] args) {
    int[] scores = new int[10];
    int sum;
    double average = 0.0;

    Scanner scanner = new Scanner(System.in);

    sum = 0;
    for (int i = 0; i < scores.length; i++) {
      System.out.print("정수" + (i + 1) + ">");
      String value = scanner.nextLine();
      scores[i] = Integer.parseInt(value);
      sum += scores[i];

    }
    average = (double) sum / scores.length;

    System.out.printf("sum = %d \t averages = %.2f", sum, average);

  }
}
