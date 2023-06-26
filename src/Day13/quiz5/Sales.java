package Day13.quiz5;
/*
5.	Sales 클래스 설계
1.	변수들: 없음

2.	메소드: main 메소드

3.	main 메소드 설계
	변수들
	SALESPEOPLE: 판매원들의 수
	sales: 판매원들의 매출액 배열
	snumber: 판매원의 번호
	sum: 총 매출액
	average: 평균 매출액
	maxid: 최대 매출액를 달성한 판매원 번호
	maxsales: 최대 매출액
	minid: 최저 매출액를 달성한 판매원 번호
	minsales: 최저 매출액

	알고리즘
1.	5 명의 판매원들의 번호와 매출액에 입력 받아 sales 배열에 저장한다.
2.	sum = 0
3.	sum을 계산한다.
4.	5 명의 판매원들의 매출액을 서로 비교하여 maxid, maxsales, minid, minsales를 계산한다.
5.	average를 계산한다.
6.	결과 값들을 출력한다.

*/

import java.util.Scanner;

public class Sales {
  public static void main(String[] args) {
    int salesPeople =0;                             //	SALESPEOPLE: 판매원들의 수
    int[]sales = null;                              //	sales: 판매원들의 매출액 배열
    int sNumber = 0;                                //	snumber: 판매원의 번호
    int sum = 0;                                    //	sum: 총 매출액
    int average = 0;                                //	average: 평균 매출액
    int maxid =0;                                   //	maxid: 최대 매출액를 달성한 판매원 번호
    int maxsales=0;                                 //	maxsales: 최대 매출액
    int minid = 0;                                  //	minid: 최저 매출액를 달성한 판매원 번호
    int minsales =0;                                //	minsales: 최저 매출액

    Scanner scanner = new Scanner(System.in);

    sales = new int[5];
    for (int i = 0; i < sales.length; i++) {
      System.out.println((i+1)+"번 판매원의 매출을 입력하세요 >>");
      sales[i] = scanner.nextInt();
      sNumber++;
    }


  }
}
