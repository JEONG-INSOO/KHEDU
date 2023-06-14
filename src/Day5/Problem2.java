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

    // 초기화면
    System.out.println("------------------------------------------------------");
    System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
    System.out.println("------------------------------------------------------");

    // 무한루프
    boolean powerOff = false;
    while (!powerOff) {
      // 선택
      System.out.print("선택 >> ");
      String choice = scanner.nextLine();
      int num = Integer.parseInt(choice);

      // 학생 수 선택

      if (num == 1) {
        System.out.println(" 학생 수를 입력하세요.");
        String studentNum = scanner.nextLine();
        int studentNum2 = Integer.parseInt(studentNum);

        int[][] arr = new int[studentNum2][];
      }


      boolean innertstop = false;
//      while(!innertstop){
//        System.out.println(j++);
//        // j값이 10일 때 제일 바깥쪽 while 문 빠져나오기
//        if (j == 10) {
//          innertstop = true;
//          outerstop = true;
        }
      }
    }
