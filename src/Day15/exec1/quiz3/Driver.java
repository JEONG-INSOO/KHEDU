package Day15.exec1.quiz3;
/*
.  Driver 클래스 설계
- 변수들: 없음
- 메소드: main 메소드

- main 메소드 설계
변수들
	student1: 학부생 객체를 가리키는 참조 변수
	student2, student3: 대학원생 객체를 가리키는 참조 변수

알고리즘
(1)	이름이 ‘길동’이고 학번이 1510인 학부생 객체를 생성하고 student1이 가리키게 한다.
(2)	student1의 소속동아리명을 '로봇'으로 변경한다
(3)	student1의 현재 상태를 출력한다.
(4)	이름이 ‘선남’이고 학번이 1601인 대학원생 객체를 생성하고 student2가 가리키게 한다.
(5)	student2의 조교유형을 '교육 조교'로 변경한다.
(6)	student2의 장학금 비율을 1.0으로 변경한다.
(7)	student2의 현 상태를 출력한다.
(8)	이름이 ‘선녀’이고 학번이 1602인 대학원생 객체를 생성하고 student3이 가리키게 한다.
(9)	Student3의 조교유형을 '연구 조교'로 변경한다.
(10)	Student3의 장학금 비율을 0.5로 변경한다.
(11)	Student3의 현 상태를 출력한다.

*/

public class Driver {
  public static void main(String[] args) {
    student student1 = new student();
    Graduate student2 = new Graduate();
    Graduate student3 = new Graduate();

    student1 = new student(null, "길동", 1510);
    student1.setClubType("로봇");
    System.out.println("student1의 동아리 " + student1.getClubType());
    System.out.println("student1의 이름 " + student1.getsNmae());
    System.out.println("student1의 학번 " + student1.getsNumber());

    student2 = new Graduate(null, "선남", 1601,0);
    student2.setAssistentType("교육 조교");
    student2.setPayRate(1.0);

    System.out.println("student2의 조교 유형 : " + student2.getAssistentType());
    System.out.println("student2의 이름 : " + student2.getName());
    System.out.println("student2의 학번 : " + student2.getNumber());
    System.out.println("student2의 장학금 비율 : " + student2.getPayRate());

    student3 = new Graduate(null, "선녀", 1602,0);
    student3.setAssistentType("연구 조교");
    student3.setPayRate(0.5);

    System.out.println("student3의 조교 유형 : " + student3.getAssistentType());
    System.out.println("student3의 이름 : " + student3.getName());
    System.out.println("student3의 학번 : " + student3.getNumber());
    System.out.println("student3의 장학금 비율 : " + student3.getPayRate());
  }
}
