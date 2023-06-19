package Day8.carzip;

public class CarMain2 {
  public static void main(String[] args) {
    Car c1 = new Car("1111", "검정");
    Car c2 = new Car("2222", "흰색");
    Car c3 = new Car("3333", "빨강");

    System.out.println(c1.getUniqueNumber());
    System.out.println(c2.getUniqueNumber());
    System.out.println(c3.getUniqueNumber());

    int num = 1;  // 차량 고유 번호(숫자)
    String s = String.valueOf(num); //차량 고유번호(문자열)
    int length = s.length();
    System.out.println("차량 번호 길이 = " + length);

    String zero = "";
    for (int i = 1; i <= 3 - length; i++) {
      zero += "0";
    }
    System.out.println(zero + num);
  }
}
