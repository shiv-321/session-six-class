package day5;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

public class EmployeePractice1 {
    public static int count;
    private  String name; //required     //can put default value here but it is there even you don't give the value
    private double salary; //required
    private LocalDate joiningDate; // required
    private int age;  // optional

    //Default constructor
    public EmployeePractice1(){

        Logger.getGlobal().info("Constructor called");
    }
    //Parameterized constructor
    public EmployeePractice1(String name, double salary, LocalDate joiningDate){
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.joiningDate = Objects.requireNonNullElse(joiningDate, LocalDate.now());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getAge() {
        return age;
    }
}
