package Day2;
// Math.random() 은 0<= x < 1 의 실수 랜덤추출.
public class Exam6 {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 100) + 1;
    int y = (int)(Math.random() * 100) + 1;
    int z = (int)(Math.random() * 100) + 1;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);


    int max = x;
    if (max < y) {
      max = y;
    }
    if (max < z) {
      max = z;
    }

    System.out.println("최대값 = " + max);

//    System.out.println((int)(Math.random()*45)+1);
  }
}