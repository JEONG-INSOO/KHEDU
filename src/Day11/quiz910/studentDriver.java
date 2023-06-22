package Day11.quiz910;

import Day8.exam3.Student;

/*
10.	StudentDriver 클래스 설계
- main 메소드 설계
 변수들
	student1: 첫 번째 Student 객체 참조변수
	student2: 두 번째 Student 객체 참조변수

알고리즘
1.	Student 객체를 생성하여 student1이 가리키게 한다.
2.	객체 student1의 이름을 ‘갑돌’로 변경한다.
3.	객체 student1의 학번을 100으로 변경한다.
4.	객체 student1의 소속학과를 컴퓨터공학과로 변경한다.
5.	객체 student1의 이름, 학번과 소속학과를 출력한다.
6.	Student 객체를 생성하여 student2가 가리키게 한다.
7.	객체 student2의 이름을 ‘갑순’으로 변경한다.
8.	객체 student2의 학번을 200으로 변경한다.
9.	객체 student2의 소속학과를 건축학과로 변경한다.
10.	객체 student2의 이름, 학번과 소속학과를 출력한다.
11.	객체 student2의 소속학과를 수학과로 변경한다.
12.	객체 student2의 이름, 학번과 소속학과를 출력한다.
*/
public class studentDriver {
    public static void main(String[] args) {
        student student1;           //	student1: 첫 번째 Student 객체 참조변수
        student student2;           //	student2: 두 번째 Student 객체 참조변수

        //1.	Student 객체를 생성하여 student1이 가리키게 한다.
        student1 = new student();
        //2.	객체 student1의 이름을 ‘갑돌’로 변경한다.
        student1.setName("갑돌");
        //3.	객체 student1의 학번을 100으로 변경한다.
        student1.setNumber(100);
        //4.	객체 student1의 소속학과를 컴퓨터공학과로 변경한다.
        student1.setDepartment("컴퓨터공학과");
        //5.	객체 student1의 이름, 학번과 소속학과를 출력한다.
        System.out.println(student1.toString());
        System.out.println("학생1의 이름: " + student1.getName());
        System.out.println("학생1의 학번: " + student1.getNumber());
        System.out.println("학생1의 소속학과: " + student1.getDepartment());
        //6.	Student 객체를 생성하여 student2가 가리키게 한다.
        student2 = new student();
        //7.	객체 student2의 이름을 ‘갑순’으로 변경한다.
        student2.setName("갑순");
        //8.	객체 student2의 학번을 200으로 변경한다.
        student2.setNumber(200);
        //9.	객체 student2의 소속학과를 건축학과로 변경한다.
        student2.setDepartment("건축학과");
        //10.	객체 student2의 이름, 학번과 소속학과를 출력한다.
        System.out.println(student2.toString());
        System.out.println("학생2의 이름: " + student2.getName());
        System.out.println("학생2의 학번: " + student2.getNumber());
        System.out.println("학생2의 소속학과: " + student2.getDepartment());
        //11.	객체 student2의 소속학과를 수학과로 변경한다.
        student2.setDepartment("수학과");
        //12.	객체 student2의 이름, 학번과 소속학과를 출력한다.
        System.out.println(student2.toString());
        System.out.println("학생2의 이름: " + student2.getName());
        System.out.println("학생2의 학번: " + student2.getNumber());
        System.out.println("학생2의 소속학과: " + student2.getDepartment());


    }
}
