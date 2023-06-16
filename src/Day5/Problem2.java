package Day5;
/*
문제)배열을 사용하여 학생수많큼 점수를 입력받고
분석(최고득점,평균) 할수있다.
------------------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
------------------------------------------------------
선택>>

1번선택시 학생수입력
학생수> 4

2번선택시 점수를 키보드로 학생수 많큼 입력받는다
점수1> 90
점수2> 70
점수3> 60
점수4> 80

3번 선택시 입력된 점수 목록을 보여준다
score[0] = 90
score[1] = 70
score[2] = 60
score[3] = 80

4번 선택시
최고점수 = 90
평균 = 75

5번 선택시 아래 메세지 출력후 종료함
프로그램 종료!!
*/

import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int students = 0;
    int score[] = null;
    boolean powerOff = false;
    while (!powerOff) {
      // 초기 화면
      System.out.println("------------------------------------------------------");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("------------------------------------------------------");
      System.out.printf("선택 >> ");
      int choice = scanner.nextInt();
      switch (choice) {

        //1. 학생수
        case 1:
          System.out.printf("학생수 > ");
          students = scanner.nextInt();
          score = new int[students];

          break;
        //2. 점수 입력
        case 2:
          if (score == null) {
            System.out.println("학생 수를 먼저 입력 바랍니다.");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.printf("점수" + (i + 1) + "> ");
            score[i] = scanner.nextInt();
          }break;

        //3. 점수 리스트
        case 3:
          if (score == null) {
            System.out.println("학생 수를 먼저 입력 바랍니다.");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.println("score["+ i +"] = " + score[i]);
          }break;

        //4. 분석
        case 4:
          if (score == null) {
            System.out.println("학생 수를 먼저 입력 바랍니다.");
            continue;
          }
          int best = 0;
          int sum = 0;
          double avg = 0;

          for (int i = 0; i < score.length; i++) {
            best = (best < score[i] ? score[i] : best);
            sum = sum + score[i];
          }
          avg = (double) sum/students;
          System.out.println("최고점수 = " + best);
          System.out.println("평균점수 = " + avg);
          break;

          //5. 종료
        case 5:
          powerOff = true;
          System.out.println("프로그램 종료!!");
          break;
        default :
          System.out.println("1~5로 고르시오");
      }
    }
  }
}

