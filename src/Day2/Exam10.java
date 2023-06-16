package Day2;
public class Exam10 {
  // ^ 베타적 논리연산자
  public static void main(String[] args) {
    System.out.println( true ^ true);
    System.out.println( false ^ false);
    System.out.println( true ^ false);
    System.out.println( false ^ true);

    // 3항연산자

    int num = 6;
    if (num % 3 == 0 ){
      System.out.println("3의 배수");
    }else{
      System.out.println("3배수 아니다");
    }

    String result = (num % 3 == 0 ) ? "3의 배수" : "3배수 아니다";
    System.out.println(result);
  }
}