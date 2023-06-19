package Day8.exam1;
/*
  오버로딩 : 메소드이름은 같고 매개변수를 다르게 정의할 수 있는 개념

  return : 1. 메소드 종료
           2. return 문 뒤에 표현식을 평가한 값을 반환하므로
              메소드의 반환타입과 같거나 커야한다.
*/

public class Calculator {
  public int add(int x, int y) {
    if (x < 0 || y < 0) return -1;
    System.out.println("add(int x, int y)");
    int result = 0;
    result = x + y;
    return result;
  }
  public double add(int x, double y) {
    System.out.println("add(int x, double y)");
    double result = 0.0;
    result = x + y;
    return result;
  }

  public double add(double x, double y) {
    System.out.println("add(double x, double y)");
    double result = 0.0;
    result = x + y;
    return result;
  }

  public double add(double x, double y, double z) {
    System.out.println("add(double x, double y)");
      double result = 0.0;
      result = x + y + z;
      return result;
  }
}
