package Day3.exec;

public class Question3 {
  public static void main(int[] args) {
    for (int i = 0; ;i++) {
      if (i == 11) break;
      if (i % 2 == 1) continue;
      System.out.println(i);
    }
  }
}
