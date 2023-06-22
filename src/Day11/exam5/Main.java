package Day11.exam5;

import Day6.exam4.Dice;

public class Main {
    public static void main(String[] args) {
        dice d1 = new dice();
        dice d2 = new dice();

//        int[] x = new int[]{1, 2, 3};
//        String[] name = new String[]{"홍길동", "홍길서"};
//        String[] name2 = new String[]{"홍길동1", "홍길동2", "홍길동3"};

        dice[] dies = new dice[2];
        dies[0] = d1;
        dies[1] = d2;

        // 사람생성
        Person p1 = new Person();
        // 사람에게 주사위를 건네다
        p1.setDice(dies);

        // 주사위 굴리기
        p1.rollDice();
        dice[] dice = p1.getDice();
        for (int i = 0; i < dice.length; i++) {
            System.out.print(dies[i].getFaceValue()+" / " );
        }

        System.out.println();
        // 한번 더 굴리기
        p1.rollDice();
        dice = p1.getDice();
        for (int i = 0; i < dice.length; i++) {
            System.out.print(dies[i].getFaceValue()+" / " );
        }

    }
}
