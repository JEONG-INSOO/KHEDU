package Day7.exam1;
/*
  1. 생성자 : 인스턴스를 만들고 속성을 초기화 하는 용도
             메소드의 한 종류
             인스턴스를 생성하는 역할
             클래스이름과 동일한 이름을 갖는다.
             반환 타입이 없다.
             매개 변수가 다른 생성자를 여러개 가질수 있다 (생성자 overloading)
          ** default(기본) 생성자 : 매개변수가 없는 생성자
                                  생성자가 하나도 정의 안된 경우에 한해서 컴파일러가 자동 생성
  2. this : 향후에 인스턴스로 만들어질 대상.
*/
public class Person {
  String name;
  int age;

  Person() {
    age = 1;
  }
  // 생성자가 하나도 정의 안된 경우 별도 입력 없어도 컴파일러가 넣어줌

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Person(String name) {
    this.name = name;
    this.age = 1;
  }
  //웃다
  void smile() {
    System.out.println("웃다");
  }

  //먹다
  void eat() {
    System.out.println("먹다");
  }
}
