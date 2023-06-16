package Day4;
/*
  null : 참조 타입에 사용되며 값이 없음을 의미
*/

public class Exam9 {
  public static void main(String[] args) {
    int[] subject = null;
//    int kor = null;
    System.out.println(subject);

    subject = new int[3];
    System.out.println(subject);        // 참조변수의 주소

    for (int i = 0; i < subject.length; i++) {
      System.out.println(subject[i]);     // 참조 변수의 주소가 가르키는 요소
    }
  }
}