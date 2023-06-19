package Day1;

public class Exam2 {
  public static void main(String[] args) {
    int dansu = 2;                                              // dansu는 정수
    for (int i = 1; i <= 9; i++) {
      System.out.println( dansu + "*" + i + "=" + (dansu * i)); // 여기서의 +는 연결 연산자. 쌍따옴표는 문자열
    }
  }
}