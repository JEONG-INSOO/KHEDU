package Day1;
/*
 국어 영어 수학 점수의 총계와 평균을 구하는 프로그램을 작성하시오.
 */
public class Exam4 {
  public static void main(String[] args) {
    int kor = 90;
    int eng = 80;
    int math = 75;

    int sum = kor + eng + math; // 점수 총계
    double avg = (double)sum/3; // 점수 평균

    System.out.println("국어점수: " + kor);
    System.out.println("영어점수: " + eng);
    System.out.println("수학점수: " + math);
    System.out.println("점수총계: " + sum);
    System.out.println("점수평균: " + avg);

  }
}