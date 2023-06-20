package Day8.exam6;

import java.sql.SQLOutput;

public class CarMain4 {
    public static void main(String[] args) {
        Car[] garage = new Car[3];

        garage[0] = new Car(1111, "검정");
        System.out.println(garage[0].getSpeed());
        garage[0].speedUp();
        garage[0].speedUp();
        garage[0].speedDown();
        System.out.println(garage[0].getSpeed());

        garage[1] = new Car(2222, "빨강");
        System.out.println(garage[0].toString());
        garage[2] = new Car(3333, "파랑");
        System.out.println(garage[0].toString());

//        garage[3] = new Car(4444, "흰색");           최대 3개라 불가능
        garage[0] = new Car(4444, "흰색");
        Car[] garage2 = new Car[5];
        System.out.println("----------------------");
        for (int i = 0; i < garage.length; i++) {
            garage2[i] = garage[i];
        }
        System.out.println("----------------------");
        for (int i = 0; i < garage2.length; i++) {
            if (garage2[i] != null) {

            System.out.println(garage2[i].toString());
            }
        }
    }
}
