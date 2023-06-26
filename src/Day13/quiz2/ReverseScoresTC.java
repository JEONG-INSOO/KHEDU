package Day13.quiz2;

import java.util.Scanner;

public class ReverseScoresTC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] scores = null;
    int numscores = 0;
    int tempscore = 0;

    System.out.print("입력할 점수들의 수 > ");
    numscores = Integer.parseInt(scanner.nextLine());
    scores = new int[numscores];
    for (int i = 0; i < scores.length; i++) {
      System.out.print("점수" + (i + 1) + ">");
      scores[i] = Integer.parseInt(scanner.nextLine());
    }
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("scores[%d]=%d", i,scores[i]);
      System.out.println();
    }
    for (int i = 0; i < numscores / 2; i++) {
      tempscore = scores[i];
      scores[i] = scores[numscores - 1 - i];
      scores[numscores - 1 - i] = tempscore;
    }
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("scores[%d]=%d", i,scores[i]);
      System.out.println();
    }
  }
}
