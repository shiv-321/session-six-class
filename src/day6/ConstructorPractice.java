package day6;

import java.util.Objects;
import java.util.logging.Logger;

public class ConstructorPractice {
    private String name;
    private float salary;
    private String licenseNumber;

//    default constructor
    public ConstructorPractice(){
        this.name = "";
        this.salary = 0;
        this.licenseNumber= "";
    }
    /**
     * constructor is a method that have same name with class name.
     * created a default constructor and added their default value to understand but not need to add this way
     * Even we don't create default constructor it will be there implicitly.     *
     */
    //constructor with two parameters
    public ConstructorPractice(String name, float salary){
        this.name = "Ashu";
        this.salary = 1000.89f;
    }

    /**
     * Constructor with parameters are called parameterized constructor.
     * And we can have multiple parameter with the same constructor name which is called constructor overloading.
     *
     */
    //constructor with three parameters
    public ConstructorPractice(String name, float salary, String licenseNumber){
        this.name = Objects.requireNonNullElse(name, "Unknown"); // doing this to avoid null pointer exception error
        this.salary = salary;                                             // no need to do for primitive data
        this.licenseNumber = Objects.requireNonNullElse(licenseNumber, "Unknown");
    }

    /**
     * While we create constructor we generally do not give the value like in the constructor with two parameters
     * we use this keyword to reference the field like in the constructor with three parameters
     * And we assign the variables after creating object
     * creating an object is also called, calling a constructor
    */

    public static void main(String[] args) {
//        ConstructorPractice student1 = new ConstructorPractice();
//        Logger.getGlobal().info(student1.name);
//        Logger.getGlobal().info(student1.licenseNumber);
//        Logger.getGlobal().info(String.valueOf(student1.salary));

        ConstructorPractice student2 = new ConstructorPractice("Ashu", 1000.89f);
        Logger.getGlobal().info(student2.name);
        Logger.getGlobal().info(String.valueOf(student2.salary));

        ConstructorPractice student3 = new ConstructorPractice("Ashu", 1000.89f, "123123321");
        Logger.getGlobal().info(student3.name);
        Logger.getGlobal().info(student3.licenseNumber);
        Logger.getGlobal().info(String.valueOf(student3.salary));

// If I tried to get access the variables from other class then I need to use getter and setter methods.
    }




}
