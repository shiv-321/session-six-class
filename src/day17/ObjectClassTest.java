package day17;

import java.util.logging.Logger;

public class ObjectClassTest {
    public static void main(String[] args) {
        Student student = new Student("Rush", 8, 10);
        Student student1 = new Student("Rush", 8, 10);
        // although the content are same these two objects are different
        //these two objects have two memory location

        Logger.getGlobal().info(student.toString());
        Logger.getGlobal().info(student1.toString());
//        System.out.println(student); // if we use this method we even don't need to add .toString but still it will give result following the toString method
        // to calculate hashcode
        Logger.getGlobal().info(String.valueOf(student.hashCode()));
        Logger.getGlobal().info(String.valueOf(student1.hashCode()));
//        Logger.getGlobal().info(String.valueOf(student));

//        student.toString();
//        student.equals();
//        student.hashCode();

//        boolean isEqual = student ==student1;
        boolean isEqual = student.equals(student1);
        Logger.getGlobal().info(String.valueOf(isEqual));


    }
}
