package day6;

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

    //constructor with two parameters
    public ConstructorPractice(String name, float salary){
        this.name = "Ashu";
        this.salary = 1000.89f;
    }

    //constructor with three parameters
    public ConstructorPractice(String name, float salary, String licenseNumber){
        this(name, salary);
        this.licenseNumber = "123123321";

    }


    public static void main(String[] args) {
        ConstructorPractice student1 = new ConstructorPractice();
        Logger.getGlobal().info(student1.name);
        Logger.getGlobal().info(student1.licenseNumber);
        Logger.getGlobal().info(String.valueOf(student1.salary));

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
