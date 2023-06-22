package Day11.quiz8;

public class timeDriver {
    public static void main(String[] args) {
        time t = new time();

        t.setHour(12);
        t.setMinute(27);
        t.setSecond(30);

        t.printTime();

        t.adjustHour(1);
        t.printTime();

        t.adjustHour(70);
        t.printTime();
    }
}
