package Day8.carzip;

public class Car {

  private static int uniqueNumber;    // 차량 고유번호

  final int MAX_SPEED;    // 최고 속도
  private int speed;      // 속도

  private String color;    // 색상

  private String num;        // 차량번호
  //차량 번호 받아오기
  public String getNum() {
    return num;
  }
  //차량 색상 받아오기
  public String getColor() {
    return color;
  }
  //차량 색상 쓰기
  public void setColor(String color) {
    this.color = color;
  }
  //차량 고유 번호 받아오기
  public int getUniqueNumber() {
    return uniqueNumber;
  }

  // 차생성
  Car(String num, String color) {
    MAX_SPEED = 240;            //최고 속도 설정
    this.num = num;
    this.uniqueNumber++;
    this.color = color;
  }

  // 가속하다.
  public void accspeed() {
    if (speed == MAX_SPEED) {
      System.out.println("현재 최대속도. 더 이상의 가속은 불가합니다.");
      return;
    }
    this.speed += 10;
    System.out.println("현재속도 : " + this.speed);
  }

  // 감속하다.
  public void brkspeed() {
    if (speed == 0) {
      System.out.println("차량이 멈춰있습니다. 더 이상의 감속은 불가합니다.");
      return;
    }
    this.speed -= 10;
    System.out.println("현재속도 : " + this.speed);
  }


}

