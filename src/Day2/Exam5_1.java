package Day2;

public class Exam5_1 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 30;
    int a = 40;

    int max = x;
    if (max < y) {
      max = y;
    }
    if (max < z) {
      max = z;
    }
    if (max < a) {
      max = a;
    }
    System.out.println("최대값 = " + max);
  }
}