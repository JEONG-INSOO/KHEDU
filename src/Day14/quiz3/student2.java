package Day14.quiz3;
//10.	(a) Student2 클래스 설계
//1.	변수들
//	name: 이름
//	number: 학번
//
//2.	메소드
//	생성자메소드: 주어진 값들을 가진 새로운 Student 객체를 생성한다
//	toString: 현 Student 객체의 정보에 대한 문자열을 반환한다
//	getName: 학생의 이름을 반환한다
//	getNumber: 학생의 학번을 반환한다
//	setName: 학생의 이름을 주어진 값으로 변경한다
//	setNumber: 학생의 학번을 주어진 값으로 변경한다



public class student2 {

  private String number;  // 학번
  private String name;    // 이름

  //	생성자메소드: 주어진 값들을 가진 새로운 Student 객체를 생성한다
  public student2(String number, String name) {
    this.number = number;
    this.name = name;
  }

  //	toString: 현 Student 객체의 정보에 대한 문자열을 반환한다

  @Override
  public String toString() {
    return "Student2{" +
        "number='" + number + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

  //	getName: 학생의 이름을 반환한다
  public String getName() {
    return name;
  }
  //	getNumber: 학생의 학번을 반환한다
  public String getNumber() {
    return number;
  }
  //	setName: 학생의 이름을 주어진 값으로 변경한다
  public void setName(String name) {
    this.name = name;
  }
  //	setNumber: 학생의 학번을 주어진 값으로 변경한다
  public void setNumber(String number) {
    this.number = number;
  }

}
