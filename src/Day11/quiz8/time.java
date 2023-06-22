package Day11.quiz8;

public class time {
/*8.	Time 클래스 설계
변수들
	hour: 시
	minute: 분
	second: 초

메소드들
	getHour: 시를 반환한다
	getMinute: 분을 반환한다
	getSecond: 초를 반환한다
	setHour: 시를 주어진 값으로 변경한다
	setMinute: 분을 주어진 값으로 변경한다
	setSecond: 초를 주어진 값으로 변경한다
	adjustHour: 시를 주어진 양만큼 조정한다
	adjustMinute: 분을 주어진 양만큼 조정한다
	adjustSecond: 초를 주어진 양만큼 조정한다
	printTime: 현재 시간을 출력한다
*/
    private int hour;       //	hour: 시
    private int minute;     //	minute: 분
    private int second;     //	second: 초

    //	getHour: 시를 반환한다
    public int getHour() {
        return hour;
    }
    //	setHour: 시를 주어진 값으로 변경한다
    public void setHour(int hour) {
        this.hour = hour;
    }
    //	getMinute: 분을 반환한다
    public int getMinute() {
        return minute;
    }
    //	setMinute: 분을 주어진 값으로 변경한다
    public void setMinute(int minute) {
        this.minute = minute;
    }
    //	getSecond: 초를 반환한다
    public int getSecond() {
        return second;
    }
    //	setSecond: 초를 주어진 값으로 변경한다
    public void setSecond(int second) {
        this.second = second;
    }
    //	adjustHour: 시를 주어진 양만큼 조정한다
    public void adjustHour(int hour) {
    if(this.hour + hour > 25 ) return;
    this.hour += hour;
    }
    //	adjustMinute: 분을 주어진 양만큼 조정한다
    public void adjustMinute(int minute) {
    if(this.minute + minute > 60 ) return;
    this.minute += minute;
    }
    //	adjustSecond: 초를 주어진 양만큼 조정한다
    public void adJustSecond(int second) {
    if(this.second + second > 60 ) return;
    this.second += second;
    }
    //	printTime: 현재 시간을 출력한다
    public void printTime() {
        System.out.println("현재 시각은" + getHour()+":" + getMinute()+":" + getSecond());
    }
}
