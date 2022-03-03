package day2;

import java.util.ArrayList;

public class PolymorphismPractice {
    public static void main(String[] args) {

        //Run time polymorphism
        Students students = new Students();
        Teachers teacher = new Teachers();
        Staff staff = new Staff();

        //can add all students, teacher, and staff in this list
        ArrayList<Person>arrayList = new ArrayList<>();
        arrayList.add(teacher);
        arrayList.add(students);
        arrayList.add(staff);

        //can add only student in this list
        ArrayList<Students>studentsArrayList = new ArrayList<>();
        studentsArrayList.add(students);

        //can add only teacher in this list
        ArrayList<Teachers>teachersArrayList = new ArrayList<>();
        teachersArrayList.add(teacher);

        //can add only staff in this list
        ArrayList<Staff>staffArrayList = new ArrayList<>();
        staffArrayList.add(staff);

        System.out.println(arrayList.size());
        add(2,3);

// compile time polymorphism
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
