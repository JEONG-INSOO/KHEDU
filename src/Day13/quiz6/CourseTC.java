package Day13.quiz6;

import java.util.Arrays;

/*
6.	(a) Course 클래스 설계
1.	변수들
	coursename: 교과목명
	students: Student 객체들의 배열
	count: 학생들의 갯수

2.	메소드
	생성자메소드: 비어있는  배열 객체를 만든다
	addStudent: 현 Course 객체에 한 Student 객체를 추가한다
	getAverage: 교과목 수강 학생들의 시험 점수들의 평균을 구한다
	toString: 현 Course 객체의 상태를 문자열로 반환한다
*/
public class CourseTC {
  private String courseName;
  private Student[] Student;
  private int count;

  public CourseTC(String courseName) {
    this.courseName = courseName;
    Student = new Student[3];
  }

  public void addStudent(int sno, int score1, int score2, int score3, String name) {
    Student[count] = new Student(sno,score1,score2,score3,name);
    count++;
  }
  public double getAverage() {
    double sum = 0.0;
    double avg = 0.0;
    for (int i = 0; i < count; i++) {
      sum = Student[i].getAverage();
    }
    avg =  sum / count;
    return avg;
  }

  @Override
  public String toString() {
    String str = "교과목명 : " + courseName + "ln";
    for (int i = 0; i < count; i++) {
      str += Student.toString() + "\n";
    }
    System.out.println("교과목명 : " + courseName);
    return "CourseTC{" +
        "courseName='" + courseName + '\'' +
        ", Student=" + Arrays.toString(Student) +
        ", count=" + count +
        '}';
  }
}
