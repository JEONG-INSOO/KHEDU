package Day12.SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Random random = new Random();
        boolean stop = false;
        do {
            int number1 = 0 , number2 = 0, number3 = 0;
            number1 = random.nextInt(10)+1;
            number2 = random.nextInt(10)+1;
            number3 = random.nextInt(10)+1;

            System.out.printf("%d, %d, %d ===> \n", number1, number2, number3);

            if (number1 == number2 && number2 == number3) {
                System.out.println("☆★☆★☆★☆★1등☆★☆★☆★☆★");
            } else if (number1 == number2 || number2 == number3 || number1 == number3) {

                System.out.println("☆★2등☆★");
            } else {
                System.out.println(" 꽝 ! ");
            }
            System.out.println("계속하시겠습니까? (Y,N) ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("N")) {
                stop = true;
            }
        } while (!stop);
    }
}
