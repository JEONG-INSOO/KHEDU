package Day14.exam1;

public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    student s = new student();

    // 상위 타입은 하위 타임을 참조할 수 있다.
    Person p = new student();

    //하위 타입은 상위 타입을 참조할 수 없다.
    //student2 s = new Person();

    int x = 10;
    double y = 20.0;

    y=x;          // 상위 타입에 하위 타입을 할당할 수 있다.
//    x=y;        // 하위 타입에 상위 타입을 할당할 수 없다.
    x = (int)y;   // 하지만 강제 형변환을 통해 대입 가능 (주의: 값손실 발생)

    short a = 10;   //2btye
    byte b = (byte) a;     //1byte

    byte c = -128;
    byte d = (byte)-129;
    System.out.println("d= " +d);
  }
}
