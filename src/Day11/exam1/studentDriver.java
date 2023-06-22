package Day11.exam1;

public class studentDriver {
    public static void main(String[] args) {
        student student = new student("1111", "정인수",90,80,70);

        System.out.println(student);
        student.setScore(1, 95);
        student.setScore(2, 85);
        student.setScore(3, 75);

        System.out.println(student);
        System.out.println(student.getScore(1));
        System.out.println(student.getScore(2));
        System.out.println(student.getScore(3));
    }
}
