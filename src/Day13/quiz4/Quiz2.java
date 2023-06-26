package Day13.quiz4;
/*
4.	Quiz2 클래스 설계
1.	변수들: 없음

2.	메소드: main 메소드

3.	main 메소드 설계
	변수들
	numofquestions: 문제수
	key: 정답들의 배열
	answer: 사용자의 답
	flag: 채점 계속 여부 확인
	numofcorrectanswers: 맞은 답들의 수
	score: 점수

	알고리즘
1.	numofcorrectanswers = 0; score = 0;
2.	문제 수를 입력받는다.
3.	정답들의 배열의 크기를 문제 수로 정한다.
4.	정답을 입력받는다.
5.	사용자의 답을 입력 받아 정답과 비교한다.
6.	점수를 계산한다.
7.	결과를 출력한다.
8.	채점의 계속 여부를 물어 사용자의 입력 값을 flag에 저장한다.
9.	numofcorrectanswers = 0; score = 0;
10.	flag이 ‘y’이면 4번으로 간다.


*/

import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {
    int numOfQuestions = 0;         //    	numofquestions: 문제수
    int[] key = null;               //	key: 정답들의 배열
    int answer = 0;                 //	answer: 사용자의 답
    boolean flag = false;           //	flag: 채점 계속 여부 확인
    int numOfcorrectAnswers = 0;    //	numofcorrectanswers: 맞은 답들의 수
    int score = 0;                  //	score: 점수

    Scanner scanner = new Scanner(System.in);

      System.out.println("문제 수를 입력하세요 >>");
      numOfQuestions = scanner.nextInt();
      key = new int[numOfQuestions];

    do {
      for (int i = 0; i < key.length; i++) {
        System.out.println("정답을 입력하세요 >>");
        key[i] = scanner.nextInt();
      }
      for (int i = 0; i < key.length; i++) {
        System.out.println("사용자의 답을 입력하세요 >>");
        answer = scanner.nextInt();
        if (key[i] == answer) {
          numOfcorrectAnswers+=1;
          score = numOfcorrectAnswers;
        }}
      System.out.println("점수" + score);

      System.out.print("계속 던지시겠습니까? (y/n) ");
      numOfcorrectAnswers = 0;
      score = 0;
      if (!scanner.nextLine().equalsIgnoreCase("y")) {
        flag = true;
      }
    } while (!flag);
    System.out.println("프로그램종료");

  }
    }

