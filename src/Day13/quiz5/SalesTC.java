package Day13.quiz5;

import java.util.Scanner;

public class SalesTC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int SALESPEOPLE = 5;
    int[] sales = new int[SALESPEOPLE];
    int snumber = 0;
    int sum =0 ;
    double average = 0.0;
    int maxid = 0;
    int maxsales =0;
    int minid =0;
    int minsales=0;

    for (int i = 0; i < sales.length; i++) {
      System.out.println("판매원 번호 >>");
      snumber = Integer.parseInt(scanner.nextLine());
      System.out.println("매출액  >>");
      sales[snumber - 1] = Integer.parseInt(scanner.nextLine());
      }
    maxsales = sales[0];
    minsales = sales[0];
    for (int i = 0; i < sales.length; i++) {
      sum += sales[i];
      if (maxsales < sales[i]) {
        maxsales = sales[i];
        maxid = i;
      }
      if (minsales > sales[i]) {
        minsales = sales[i];
        minid = i;
      }
      average = (double) sum / sales.length;
    }
    System.out.println(" 총 매출액 : " + sum);
    System.out.println(" 평균 매출액 : " + average);
    System.out.println(" 최대 매출액 : " + maxsales + "         사원번호" + (maxid+1));
    System.out.println(" 최소 매출액 : " + minsales + "         사원번호" + (minid+1));
  }
}
