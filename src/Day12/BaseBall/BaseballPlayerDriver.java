package Day12.BaseBall;

import java.util.Scanner;

public class BaseballPlayerDriver {
    public static void main(String[] args) {
        String bpname = null;       //입력받은 선수 이름
        String bpposition = null;   //입력받은 선수 위치
        int nohits = 0;             //입력받은 선수 안타수
        int nowalks = 0;            //입력받은 선수 4구수
        int sumhits = 0;            //선수들 안타수의 합
        int sumwalks = 0;           //선수들 4구수의 합
        BaseballPlayer[] bp = new BaseballPlayer[9];        //야수선수들의 배열

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < bp.length; i++) {
            System.out.print("선수 이름 >> ");
            bpname = scanner.nextLine();
            System.out.print("선수 위치 >> ");
            bpposition = scanner.nextLine();
            System.out.print("안타 수 >> ");
            nohits = scanner.nextInt();
            System.out.print("4구 수 >> ");
            nowalks = scanner.nextByte();

            bp[i] = new BaseballPlayer(bpname);
            bp[i].setPosition(bpposition);
            bp[i].setNumHits((nohits));
            bp[i].setNumWalks(nowalks);
        }
        for (int i = 0; i < bp.length; i++) {
            //case 1:
            System.out.println(bp[i]);
            //case 2:
            System.out.printf("이름 %s \n", bp[i].getName());
            System.out.printf("포지션 %s \n", bp[i].getPosition());
            System.out.printf("안타수 %d \n", bp[i].getNumHits());
            System.out.printf("4구수 %d \n", bp[i].getNumWalks());
            System.out.println();

            sumhits += bp[i].getNumHits();
            sumwalks += bp[i].getNumWalks();

            System.out.printf("누적 안타 수: %d", sumhits);
            System.out.printf("누적 4구 수: %d", sumwalks);
        }
    }
}
