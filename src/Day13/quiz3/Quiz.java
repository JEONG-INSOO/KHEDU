package Day13.quiz3;
/*
3.	Quiz 클래스 설계
1.	변수들: 없음

2.	메소드: main 메소드

3.	main 메소드 설계
	변수들
	numofquestions: 문제수
	key: 정답들의 배열
	answer: 사용자의 답
	numofcorrectanswers: 맞은 답들의 수
	score: 점수

	알고리즘
1.	문제 수를 입력받는다.
2.	정답들의 배열의 크기를 문제 수로 정한다.
3.	정답을 입력받는다.
4.	사용자의 답을 입력 받아 정답과 비교한다.
5.	점수를 계산한다.
6.	결과를 출력한다.

*/

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    int numOfQuestion;            //	numofquestions: 문제수
    int[] key = null;             //	key: 정답들의 배열
    int answer = 0;                   //	answer: 사용자의 답
    int numOfCorrectAnswers = 0;      //	numofcorrectanswers: 맞은 답들의 수
    int score = 0;                    //	score: 점수

    Scanner scanner = new Scanner(System.in);

    System.out.println("문제 수를 입력하세요 >>");
    numOfQuestion = scanner.nextInt();
    key = new int[numOfQuestion];
    for (int i = 0; i < key.length; i++) {
      System.out.println("정답을 입력하세요 >>");
      key[i] = scanner.nextInt();
    }
    for (int i = 0; i < key.length; i++) {
      System.out.println("사용자의 답을 입력하세요 >>");
      answer = scanner.nextInt();
      if (key[i] == answer) {
        numOfCorrectAnswers+=1;
        score = numOfCorrectAnswers;
      }
    }System.out.println("점수" + score);
  }
}
