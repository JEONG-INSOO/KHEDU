package Day2;

/*
  3개의 정수 값을 임의 지정해서 가장 큰 수를 구하시오.
  if문만 사용할 것.
*/
public class Exam5 {
  public static void main(String[] args) {
    int w = 45;
    int x = 55;
    int y = 50;
    int z = 30;

    if (w > x && w > y && w > z) {
      System.out.println("가장 큰 수는 w입니다.");
    } else if (x > y && x > z) {
      System.out.println("가증 큰 수는 x입니다.");
    } else if (y > z) {
      System.out.println("가장 큰 수는 y입니다.");
    } else {
      System.out.println("가장 큰 수는 z입니다.");
    }
  }
}
