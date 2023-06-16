package Day2;

import java.util.Scanner;

/*
for (초기식; 조건식; 증감식){
실행문;
}
 */
public class for1 {
  public static void main(String[] args) {
    int sum = 1+2+3+4+5;
    System.out.println("sum = " + sum);

    int sum2 = 0;
    for(int i=1;i<=5;i=i+1){
      sum2 = sum2 + i;
    }
    System.out.println("sum2 = " + sum2);

    int sum3 = 0;
    for (int j = 1; j <=100 ; j++) {
      sum3 = sum3 + j;
    }
    System.out.println("sum3 = " + sum3);

    Scanner scanner = new Scanner(System.in);
    System.out.println("단수를 입력하세요.");
    String num = scanner.nextLine();
    int dan2 = Integer.parseInt(num);
    for (int i = 1; i <=9 ; i=i+1) {
      System.out.println(dan2 + "*" + i + "=" +(dan2*i));
    }
  }
}