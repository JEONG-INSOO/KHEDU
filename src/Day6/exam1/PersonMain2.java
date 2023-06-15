package Day6.exam1;

public class PersonMain2 {
  public static void main(String[] args) {
    Person[] persons = new Person[3];

    Person p1 = new Person("홍길동", 10);
    Person p2 = new Person("홍길서",20);
    Person p3 = new Person("홍길남", 30);

    for (int i = 0; i < persons.length; i++) {
      persons[i].eat();
      persons[i].smile();
      System.out.println(persons[i].age);
      System.out.println(persons[i].name);
    }
  }
}
