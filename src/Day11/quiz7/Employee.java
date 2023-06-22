package Day11.quiz7;

public class Employee {
/*
7.	Employee 클래스 설계
변수들
	name: 이름
	jdn: 주민등록번호
	position: 직위
	hourlyWages: 시간당 임금

메소드들
	getPay: 임금을 계산한다
	raise: 시간당 임금을 증감한다

*/
    String name;            //	name: 이름
    String jdn;             //	jdn: 주민등록번호
    String position;        //	position: 직위
    double hourlyWages;     //	hourlyWages: 시간당 임금
    double time;            //	time: 시간

    //	getPay: 임금을 계산한다
    public double getPay() {
        if (time <= 0) return 0;
        double pay;
        if (time <= 40) {
            pay = time * hourlyWages;
        } else {
            pay = 1.5 * (time * hourlyWages);
        }return pay;
    }
    //	raise: 시간당 임금을 증감한다
    public void raise(int hourlyWages) {
        this.hourlyWages += hourlyWages;        //this.hourlyWages = this.hourlyWages + hourlyWages
        }
    }
