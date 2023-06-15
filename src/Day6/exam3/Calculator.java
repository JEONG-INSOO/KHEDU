package Day6.exam3;

public class Calculator {
  //명사 (field)
  String color;

    Calculator(){}
  Calculator(String color) {
    this.color = color;
  }
  //동사 (method)

  //2개의 정수를 받아 사칙연산
  public int add(int num1, int num2) {
    int sum = 0;
    sum = num1 + num2;
    return sum;
  }
}
