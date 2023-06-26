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
public class Course {
  String coursename;
  int[] student = null;
  int count = 0;

  public Course(int[] student) {
    this.student = student;
  }

  public void addStudent() {
    student = new int[count];
  }
  public void getAverage() {
    int average = 0 / count;
  }

  @Override
  public String toString() {
    return "Course{" +
        "coursename='" + coursename + '\'' +
        ", student=" + Arrays.toString(student) +
        ", count=" + count +
        '}';
  }
}
