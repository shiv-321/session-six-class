package day5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Office {
    public static void main(String[] args) {
        Logger.getGlobal().setLevel(Level.OFF);
//        Employee employee = new Employee();
//
//        Logger.getGlobal().info(employee.toString());
//
//        employee.setName("Subina");
//        employee.setSalary(5000);
//        employee.setPhoneNumber("123456789");
//        Logger.getGlobal().info(employee.toString());

        Employee employee1 = new Employee("Subina", 5000.0f, "123456789", Gender.MALE);
        Employee employee2 = new Employee("Subina", 5000.0f, "123456789", Gender.MALE);
        Employee employee3 = new Employee("Subina", 5000.0f, "123456789", Gender.MALE, "1112223333");

        employee1.addBonus(employee1, 500);
        System.out.println(employee1);

        if(employee1.getGender() == Gender.MALE){
            System.out.printf("Yes the gender of %s is %s", employee1.getName(), Gender.FEMALE.name());

        }

//        String name = takeNameFromUI();
//        String phoneNumber = takePhoneNumberFromUI();
//        String licenseNumber = takeLicenseNumberFromUI();

//        Employee employee3 = new Employee(name, 0, phoneNumber, licenseNumber);
        //employee3.getName(); // didn't throw an error
//        employee3.getName().isBlank(); // Now throw an error because of null while calling function
//        employee3.getPhoneNumber().isBlank();
//        employee3.getLicenseNumber().isBlank(); // check after solving the null problem
//        if(employee3.getName().isBlank()){
//            System.out.println("The name you have entered is empty. Please enter the name again ");
//        }


    }
    public static String takeNameFromUI(){

        return null;
    }
    public static  String takePhoneNumberFromUI(){

        return null;
    }
    public static  String takeLicenseNumberFromUI(){

        return null;
    }
}
