package Day14.exam3;
/*
final + 클래스    : 개념 확장 불가
final + 메소드    : 하위 개념에서 재정의 불가
final + 필드    (메소드 밖에 선언된 변수) : 재할당불가
final + 지역변수 (메소드 내에 선언된 변수) : 재할당불가

abstract + class : 미완성 개념
    1.인스턴스 생성 불가능
    2.상위 타입으로 사용 가능
    3.미완성 메소드가 1개라도 존재하면 미완성 클래스
    4.미완성 메소드가 없더라도 abstract 가능(인스턴스 생성불가)
abstract + method: 미완성 메소드 ( 구현부가 없고 선언부만 있는 메소드 )
*/

abstract public class Person {
  abstract public void smile();

}
