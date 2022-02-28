package day6;

public class DoorStaticPractice {
    public static int count;
    private static String name = "Shivaraj";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DoorStaticPractice.name = name;
    }
}
