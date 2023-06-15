package Day6;

import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int student = 0;
    int score[] = null;
    boolean powerOff = false;

    while (!powerOff) {
      System.out.println("------------------------------------------------------");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("------------------------------------------------------");
      System.out.printf("선택 >> ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("학생수 > ");
          student = scanner.nextInt();
          score = new int[student];
          break;

        case 2:
          if (score == null) {
            System.out.println("학생수를 먼저 입력하세요.");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.println("점수" + (i + 1) + "> ");
            score[i] = scanner.nextInt();
          }
            break;

        case 3:
          if (score == null) {
            System.out.println("학생수를 먼저 입력하세요.");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
          }
          break;

        case 4:
          if (score == null) {
            System.out.println("학생 수를 먼저 입력 바랍니다.");
            continue;
          }

          int max = 0;
          int sum = 0;
          double avg = 0.0;

          if (student == 0) {
            System.out.println("학생수를 먼저 입력하세요.");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            max = (max < score[i] ? score[i] : max);
            sum += score[i];
          }
          avg = (double) sum / student;

          System.out.println("최고 점수 = " + max);
          System.out.println("평균 점수 = " + avg);

          break;

        case 5:
          System.out.println("프로그램 종료 !!");
          powerOff = true;
          break;

        default:
          System.out.println("1 ~ 5 사이로 입력하시오.");

        }

          }
      }

    }