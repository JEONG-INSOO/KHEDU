package Day14.exam1;

public class Main2 {
  public static void main(String[] args) {
    student s1 =new student();
    s1.study();
    Person p1 = s1;
//    p1.study();
//    student s2 = p1;
    student s2 = (student) p1;
    s2.study();

    Person p2 = new Person();
    student s3 = (student) p2;
    s3.study();
  }
}
