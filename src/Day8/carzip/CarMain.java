package Day8.carzip;
/*
Car 설계해보기


        속성 : 차량번호, 운행속도, 색상, 차량고유번호

        행위 : 가속하다,감속하다


        요구사항

        1. car객체 생성시 차량번호와 색상을 부여할수 있다.

        2. 가속, 감속시 운행속도를 10km씩 반영한다.

        3. 운행속도는 0~240km 범위다.

        4. 차량번호는 수정 불가능하고 색상은 수정이 가능하다.

        5. 차량고유번호는 3자리번호로 다음과 같이 생성된다
        001, 002, 003


        구현 소스

        라이브러리 클래스 Car

        실행 클래스 CarMain
        */

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car("61러 5502","검은색");
    String uN = String.format("%03d", c1.getUniqueNumber());
    System.out.println("차량 번호 = " + c1.getNum());
    System.out.println("차량 색깔 = " + c1.getColor());
    System.out.println("고유 번호 = " +uN);

    // 가속 감속
    c1.accspeed();
    c1.brkspeed();

    Car c2 = new Car( "128하 4385", "하얀색");
    uN = String.format("%03d", c2.getUniqueNumber());
    System.out.println("차량 번호 = " + c2.getNum());
    System.out.println("차량 색깔 = " + c2.getColor());
    System.out.println("고유 번호 = " + uN);

    // 색변경하기
    c2.setColor("파란색");
    System.out.println("변경된 차량 색깔 = " + c2.getColor());
  }
}