package Day7.exam3;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 10);

    String name = p1.getName();
    System.out.println(name);

    System.out.println(p1.getAge());

    System.out.println(p1.getNickname());
    p1.setNickname("별칭");
    System.out.println(p1.getNickname());
    p1.setNickname("별칭234"); // 4글자 이상 X
  }
}
