package day2;

import java.util.ArrayList;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Students students = new Students();
        Teachers teacher = new Teachers();
        Staff staff = new Staff();

        ArrayList<Person>arrayList = new ArrayList<>();
        arrayList.add(teacher);
        arrayList.add(students);
        arrayList.add(staff);

    }

    public static void add(int a, int b) {
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c) {
        int temp = a + b + c;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c, int d) {
        int temp = a + b + c + d;
        System.out.println(temp);
    }
}
