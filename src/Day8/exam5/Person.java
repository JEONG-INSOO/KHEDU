package Day8.exam5;
/*
  Object 클래스의 toString () 메소드 용도
*/

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override   // : 메소드 재정의 하겠다고 명시적으로 컴파일러에게 알려주는 정보
  public String toString() {
    return this.name + "-" + this.age;
  }
  }
