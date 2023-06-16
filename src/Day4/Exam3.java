package Day4;
/*
  상수 : 초기화 후 재할당 불가능한 변수
*/
public class Exam3 {
  public static void main(String[] args) {
    int x;  // 변수선언
    x = 10; // 초기화: 변수 선언 후 최초 값을 할당하는 행위
    System.out.println("x = " + x);

    x = 30; // 재할당
    System.out.println("x = " + x);

    final int Y; // 상수 선언  ex) USER_NUMBER
    Y = 10;      // 상수 초기화
    System.out.println("Y = " + Y);
//  Y = 20;    // 상수는 재할당 불가
  }
}