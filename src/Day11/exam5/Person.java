package Day11.exam5;

public class Person {
    private String name;
    private int age;
    private dice[] dice;

    public void smlie() {
        System.out.println("웃다");
    }

    public void eat() {
        System.out.println("먹다");
    }

    public void setDice(dice[] dice) {
        this.dice = dice;
    }
    public void rollDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }

    public Day11.exam5.dice[] getDice() {
        return dice;
    }
}
