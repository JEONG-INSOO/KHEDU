package Day7.exam9;
/*
  static: 인스턴스 생성 없이 인스턴스가 공유하는 필드
  main() 실행 전에 method 영역에 로딩된다.
*/

public class Car {
  // 인스턴스 필드
  private final int MAX_SPEED;
  private int speed;

  // 정적 필드
  static int uniqueNumber; // 차량 고유번호


  public int getUniqueNumber() {
    return uniqueNumber;
  }

  public void setUniqueNumber(int uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
  }

  Car(int speed) {
    MAX_SPEED = speed;
    uniqueNumber++;
  }
  public void run() {
    System.out.println("운행하다");
  }

  public void stop() {
    System.out.println("멈추다");
  }

  public int getSpeed() {
    return speed;
  }


  public void upspeed() {
    System.out.println("가속하다;");
    if (speed == MAX_SPEED) return;
    this.speed++;
  }
  public void downspeed() {
    System.out.println("김속하다;");
    if (speed == 0) return;
    this.speed--;
  }

  }