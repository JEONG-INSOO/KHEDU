package Day2;

public class Exam9 {
  public static void main(String[] args) {
    int x = 10;
    x = x + 1 ; // x++ (증강후위 연산자) , ++x (증강전위 연산자) 증강후위 연산자가 처리속도가 빠르다

    System.out.println("x = " + x);
    //단독으로 사용 될 때
    x++; // x = x+1
    System.out.println("x = " + x);
    ++x; // x=x+1
    System.out.println("x = " + x);
    x--; // x = x-1
    System.out.println("x = " + x);
    --x; // x = x-1
    System.out.println("x = " + x);
    // 증감연산자가 식에 참여할 때 주의
    // 전위: 자기 자신을 1증감 하고 난 뒤 식에 참여
    // 후위: 식에 참여 후 자신을 1 증감
    int z = 1 + ++x;
    System.out.println("x=" +x);
    System.out.println("z=" +z);
  }
}