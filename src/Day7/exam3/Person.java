package Day7.exam3;
/*
  getter, setter 를 통해 속성을 외부에 공개할 수 있다.
*/

public class Person {
  private String name;
  private int age;
  private String nickname;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getNickname(){
    return this.nickname;
  }

  public void setNickname(String nickname) {
    if (nickname.length() > 4) {
      printMessage();
      return;   // 메소드를 종료합니다.
    }
    this.nickname = nickname;
  }

  private void printMessage() {
    System.out.println("별칭은 4글자를 초과할 수 없습니다.");



    }
  }
