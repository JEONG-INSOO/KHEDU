package Day3;

/*
for문 연습
별표 출력하기 5행 5열
문1)         문2)       문3)           문4)               문5)
*****       *****       *             *********             *
*****       ****        **             *******             ***
*****       ***         ***             *****             *****
*****       **          ****             ***             ********
*****       *           *****             *             **********
*/
public class Exam5 {
  public static void printstar1() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }

  public static void printstar2() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printstar3() {
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printstar4() {
    for (int i = 1; i < 10; i = i + 2) {
      for (int j = 9; j > i; j = j - 2) {
        System.out.printf(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printstar5() {
    for (int i = 1; i < 10; i = i + 2) {
      for (int j = 1; j < i; j = j + 2) {
        System.out.printf(" ");
      }
      for (int k = 10; k > i; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printstar6() {
    int num = 10;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j <i ; j++) {
        System.out.print(" ");
      }
      for (int j = 2*num-1; j > 2*i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printstar7() {
    int num = 10;
    for (int i = 0; i < num; i++) {
      for (int j = num-1; j > i ; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {

    printstar1();
    System.out.println();
    printstar2();
    System.out.println();
    printstar3();
    System.out.println();
    printstar4();
    System.out.println();
    printstar5();
    System.out.println();
    printstar6();
    System.out.println();
    printstar7();
  }
}