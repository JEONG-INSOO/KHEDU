package Day8.exam2;

public class Person {
/*
  this :  향후 생성될 인스턴스를 지칭하는 예약어
  멤버 : 필드 , 메소드
  this() : 다른 생성자 호출
*/

  private String name;
  private int age;

  public Person(int age) {
    this.age = age;
  }

  public Person(String name, int age) {
//    this.name = name;
    this(name);   // 첫줄에 한번만 사용할 수 있다.
    this.age = age;
  }

  Person() {

  }

  Person(String name) {
    this.name = name;
  }

  public void smile() {
    System.out.println("웃다");
  }

  public void eat() {
    System.out.println("먹다");
  }

  //getter setter: 속성을 다른 인스턴스가 읽고 수정하는 용도

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
