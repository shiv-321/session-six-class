package day18;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(10);

        students.add(new Student("Rush", 8, 10));
        students.add(new Student("Harry", 9, 10));

        Logger.getGlobal().info(students.toString());

//        students.remove(new Student("Rush", 8, 10)); // removing using object
//        students.remove(0);                           // removing using index
        students.removeAll(students);                   // removing all ArrayList
        Logger.getGlobal().info(students.toString());
    }

}
/**
 * to remove the ArrayList with the help of object's name we should remember to override the equal method
 *
 */