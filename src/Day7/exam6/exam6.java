package Day7.exam6;

//클래스 생성
class A {
  int m = 3; // 필드
  int n = 4; // 필드
  void work1() {
    int k = 5;  // 지역변수
    System.out.println(k);
    work2(3); // work2() 안에 정의된 지역 변수를 스택 메모리에 추가
  }

  void work2(int i) {
    int j = 4;
    System.out.println(i + j);
  }
}
public class exam6 {
  public static void main(String[] args) {
    // 클래스로 객체 생성
    A a = new A();
    // 필드값 출력
    System.out.println(a.m);
    System.out.println(a.n);
    //메서드 호출
    a.work1();  // work1()안에 정의된 지역 변수를 스텍 메모리에 추가
  }
}
