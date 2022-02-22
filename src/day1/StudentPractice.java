package day1;

import java.util.logging.Logger;

public class StudentPractice {
    public static void main(String[] args) {
        Student shivaraj = new Student(); // student object
        shivaraj.name = "Shivaraj";
        shivaraj.phoneNumber = "6823464682";
        shivaraj.dob = "03/03/1993";
        shivaraj.studentClass = "ten";
        shivaraj.rollNumber = "A201";
        shivaraj.height = 154.0f;
        shivaraj.address = "Texas";
        shivaraj.idNumber = 33445566;
        shivaraj.email = "shivaraj.thapa2021@gmail.com";
        shivaraj.userName = "shivaraj";
        shivaraj.password = "asdgfhh";
        shivaraj.socialSecurityNumber = "10985";
        shivaraj.isTrue = true;
        shivaraj.playing();

       System.out.println(shivaraj.name);
       System.out.println(shivaraj.address);
        Logger.getGlobal().info(String.valueOf(shivaraj.height));
        Logger.getGlobal().info(shivaraj.dob);
    }
}
