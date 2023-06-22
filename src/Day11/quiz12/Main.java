package Day11.quiz12;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setFirstName("길동");
        p1.setLastName("홍");

        String lastName = p1.getLastName();
        String firstName = p1.getFirstName();
        int length = p1.getLength();

        System.out.println("성 = " + lastName);
        System.out.println("이름 = " + firstName);
        System.out.println("이름의 글자 수 = " + length);

        Person p2 = new Person("홍", "길동");
        firstName = p2.getFirstName();
        lastName = p2.getLastName();
        length = p2.getLength();

        System.out.println("성: " + lastName);
        System.out.println("이름: " + firstName);
        System.out.println("이름의 글자 수: " + length);
    }
}
