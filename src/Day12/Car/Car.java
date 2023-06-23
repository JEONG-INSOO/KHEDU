package Day12.Car;

public class Car {
    private static int uniqueNumber;
    private String color;
    private static final String maker ="현대";

    public Car() {
        uniqueNumber++;
    }

    public static int getUniqueNumber() {
        return uniqueNumber;
    }
}
