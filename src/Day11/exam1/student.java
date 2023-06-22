package Day11.exam1;
/*
1.	 Student 클래스 설계
변수들
	studentnumber: 학번
	name: 이름
	testscore1: 시험점수 1
	testscore2: 시험점수 2
	testscore3: 시험점수 3

메소드들
	생성자 메소드: 학번, 이름과 시험 점수들을 주어진 값들로 초기화 초기화하면서 새로운 Student 객체를 생성한다
	setScore: 시험 번호(1부터 3사이의 정수)와 그 번호에 대응하는 시험 점수를 매개변수로 받아 해당 변수의 값을 변경한다
	getScore: 시험 번호를 매개변수로 받아 그 번호에 대응하는 시험점수를 반환한다
	getAverage: 세 개의 시험 점수들의 평균을 구하여 반환한다
	toString: 학번, 이름, 시험 점수들과 시험 평균 점수를 반환한다
*/
public class student {
    private String studentNumber;       //	studentnumber: 학번
    private String name;                //	name: 이름
    private int testscore1;             //	testscore1: 시험점수 1
    private int testscore2;             //	testscore2: 시험점수 2
    private int testscore3;             //	testscore3: 시험점수 3

    //	생성자 메소드: 학번, 이름과 시험 점수들을 주어진 값들로 초기화 초기화하면서 새로운 Student 객체를 생성한다
    public student(String studentNumber, String name, int testscore1, int testscore2, int testscore3) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.testscore1 = testscore1;
        this.testscore2 = testscore2;
        this.testscore3 = testscore3;
    }

    //	toString: 학번, 이름, 시험 점수들과 시험 평균 점수를 반환한다
    @Override
    public String toString() {
        return "student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", testscore1=" + testscore1 +
                ", testscore2=" + testscore2 +
                ", testscore3=" + testscore3 +
                ", getAverage=" + getAverage() + '}';
    }

    //	setScore: 시험 번호(1부터 3사이의 정수)와 그 번호에 대응하는 시험 점수를 매개변수로 받아 해당 변수의 값을 변경한다
    public void setScore(int testNumber, int testscore) {
        switch (testNumber) {
            case 1:
                this.testscore1 = testscore;
                break;
            case 2:
                this.testscore2 = testscore;
                break;
            case 3:
                this.testscore3 = testscore;
                break;
            default:
        }
    }

    //	getScore: 시험 번호를 매개변수로 받아 그 번호에 대응하는 시험점수를 반환한다
    public int getScore(int testNumber) {
        int score = -1;
        if (testNumber == 1) {
            return testscore1;
        } else if (testNumber == 2) {
            return testscore2;
        } else if (testNumber == 3) {
            return testscore3;
        }
        return score;
    }

    //	getAverage: 세 개의 시험 점수들의 평균을 구하여 반환한다
    public double getAverage() {
        double result = (double)(testscore1 + testscore2 + testscore3) / 3;
        return result;
    }
}
