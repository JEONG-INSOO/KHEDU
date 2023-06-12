package Day3;
/*
1~10까지의 짝수 합을 구하시오.
for, while, do~while
*/

import sec02_loopcontrolstatement.EX02_WhileControlStatement.WhileControlStatement;

import javax.swing.*;

public class Exam2 {
  public static void sumWithFor() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0)
        sum += i;
    }
    System.out.println("sum = " + sum);
  }
  public static void sumWithWhile() {
    int sum = 0;
    int i = 1;
    while (i <= 10) {
      if (i % 2 == 0)
        sum += i;
        i++;
    }
    System.out.println("sum = " + sum);
  }
  public static void sumWithDoWhile() {
    int sum = 0;
    int i = 1;
    do {
      if (i % 2 == 0)
        sum += i;
        i++;
    }
    while (i <= 10) ;

    System.out.println("sum = " + sum);
  }

  public static void main(String[] args) {
    sumWithFor();
    sumWithWhile();
    sumWithDoWhile();
  }
}
