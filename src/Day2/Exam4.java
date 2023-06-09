package Day2;

public class Exam4 {
  public static void main(String[] args) {
    int kor = 40;
//    int result = kor / 10 ;          // 깔끔한 코딩을 위해 따로 계산식을 주어도 됨.
    switch (kor / 10) {                //정수와 정수를 계산하면 정수! 소숫점 자리는 절삭
//    switch ( result ) {              // 깔끔한 코딩을 위해 따로 계산식을 주어도 됨.2
      case 9:
        System.out.println("수");
        break;
      case 8:
        System.out.println("우");
        break;
      case 7:
        System.out.println("미");
        break;
      case 6:
        System.out.println("양");
        break;
      default:
        System.out.println("가");
    }
  }
}
