package Day7.exam2;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person("홍길동");
//    p2.name = "홍길남";


    System.out.println(p1.name);
    System.out.println(p1.age);

    p1.name = "홍길동";
    p2.age = 30;

    System.out.println(p1.name);
    System.out.println(p1.age);

  }
}
