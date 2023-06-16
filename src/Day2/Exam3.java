package Day2;

public class Exam3 {
  public static void main(String[] args) {
//    int x = 30;
//    int y = 10;
//    switch (x){  // x 자리에 정수(ex. 30), 수식 (ex. 10+20, x+y)이 들어와도 됨. 실수값 대입시 오류.
//      case 10:
//        System.out.println(x);
//        break; // break가 없으면 다음 case 실행
//      case 20:
//        System.out.println(x);
//        break;
//      default:
//        System.out.println("기타");
    String Day = " 금요일";
    switch (Day){
      case "월요일":
        System.out.println("1");
        break;
      case "화요일":
        System.out.println("2");
        break;
      default:
        System.out.println("기타");
    }
  }
}