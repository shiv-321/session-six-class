package day12;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[3] = "Shivaraj";

        for (int index =0; index < names.length; index++) {
            if (index == 3) {
                System.out.println(names[index]);
                break;
            } else {
                System.out.println("Not interested");
            }

        }

    }
}
