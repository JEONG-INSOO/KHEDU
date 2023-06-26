package Day13.quiz2;
/*
2.	ReverseScores 클래스 설계
1.	변수들: 없음

2.	메소드: main 메소드

3.	main 메소드 설계
	변수들
	scores: 점수들의 배열
	numscores: 점수들의 수
	tempscore: 한 점수를 저장하기 위한 변수

	알고리즘
1.	입력할 점수들의 수를 입력받는다.
2.	numscores = 입력 받은 점수들의 수
3.	numscores 수만큼 점수들을 읽어 scores 배열에 저장한다.
4.	scores 배열의 내용을 출력한다.
5.	i = 0부터 numscores/2 까지 i를 1만큼 증가시키면서 다음을 반복한다:
①	tempscore = scores[i]
②	scores[i] = scores[numscores - 1 - i]
③	scores[numscores - 1 - i] = tempscore
6.	scores 배열의 내용을 출력한다.

*/

import java.util.Scanner;

public class ReverseScores {
  public static void main(String[] args) {
    int[] scores = null;    //	scores: 점수들의 배열
    int numScores = 0;      //	numscores: 점수들의 수
    int tempScore = 0;      //	tempscore: 한 점수를 저장하기 위한 변수

    Scanner scanner = new Scanner(System.in);
    System.out.println("입력받을 점수들의 수를 정하세요 >>");
    numScores = scanner.nextInt();
    scores = new int[numScores];
    System.out.println(numScores);

    for (int i = 0; i < numScores / 2; i++) {
      tempScore = scores[i];
      scores[i] = scores[numScores - 1 - i];
      scores[numScores - 1 - i] = tempScore;
      System.out.println(scores[i]);
    }
  }
}
