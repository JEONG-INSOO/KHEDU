package Day15.exec1.quiz3;
/*
6.  Graduate 클래스 설계
- 변수들
	AssistentType: 대학원생의 조교 유형
	PayRate: 대학원생의 장학금 비율

-	메소드
	생성자메소드: 대학원생의 이름, 학번을 각각 주어진 값으로 초기화하면서 Graduate 객체를 생성한다
	getAssistentType: 대학원생의 조교 유형을 반환한다
	getPayRate: 대학원생의 장학금 비율을 반환한다
	toString: 대학원생의 현재 상태를 반환한다
	setAssistentType: 대학원생의 조교 유형을 주어진 값으로 변경한다
	setPayRate: 대학원생의 장학금 비율을 주어진 값으로 변경한다
*/

public class Graduate {
  private String AssistentType = null;    //AssistentType: 대학원생의 조교 유형
  private double PayRate = 0.0;           //PayRate: 대학원생의 장학금 비율

  private String name = null;             //대학원생 이름
  private int number = 0;                 //대학원생 학번

  Graduate() {

  }
  public Graduate(String assistentType,String name, int number,int payRate) {
    this.AssistentType = assistentType;
    this.name = name;
    this.number = number;
    this.PayRate = payRate;
  }

  @Override
  public String toString() {
    return "Graduate{" +
        "AssistentType='" + AssistentType + '\'' +
        ", PayRate=" + PayRate +
        ", name='" + name + '\'' +
        ", number=" + number +
        '}';
  }

  public String getAssistentType() {
    return AssistentType;
  }

  public void setAssistentType(String assistentType) {
    AssistentType = assistentType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPayRate() {
    return PayRate;
  }

  public void setPayRate(double payRate) {
    PayRate = payRate;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
