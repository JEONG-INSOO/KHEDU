package Day11.quiz910;
/*
    상속에서 제외되는 멤버
        1. 상위 클래스의 static 멤버
        2. 상위 클래스의 private 멤버
*/
public class student {
/*
9.	Student 클래스 설계
 변수들
	Name: 이름
	Number: 학번
	Department: 소속학과

메소드들
	getName: 이름을 반환한다
	setName: 이름을 주어진 값으로 변경한다
	getNumber: 학번을 반환한다
	setNumber: 학번을 주어진 값으로 변경한다
	getDepartment: 소속학과를 반환한다
	setDepartment: 소속학과를 주어진 값으로 변경한다
	toString: 학생의 이름, 학번과 소속학과를 반환한다
*/

    private String name;            //	Name: 이름
    private int number;             //	Number: 학번
    private String department;      //	Department: 소속학과

    public student(){
        super();
    }

    //	getName: 이름을 반환한다
    public String getName() {
        return name;
    }
    //	setName: 이름을 주어진 값으로 변경한다
    public void setName(String name) {
        this.name = name;
    }
    //	getNumber: 학번을 반환한다
    public int getNumber() {
        return number;
    }
    //	setNumber: 학번을 주어진 값으로 변경한다
    public void setNumber(int number) {
        this.number = number;
    }
    //	getDepartment: 소속학과를 반환한다
    public String getDepartment() {
        return department;
    }
    //	setDepartment: 소속학과를 주어진 값으로 변경한다
    public void setDepartment(String department) {
        this.department = department;
    }

    //	toString: 학생의 이름, 학번과 소속학과를 반환한다
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", department='" + department + '\'' +
                '}';
    }
}
