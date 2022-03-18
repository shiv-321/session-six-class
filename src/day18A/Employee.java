package day18A;

import java.time.LocalDate;

// super class
public class Employee {
    private String name;
    private LocalDate localDate;
    private double salary;

    public Employee(){

    }

    public Employee(String name, LocalDate localDate, double salary) {
        this.name = name;
        this.localDate = localDate;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public double getSalary() {
        return salary;
    }

//    public String toString(){
//        return name + "\t" + localDate + "\t" + salary;
//    }

    /**
     * toString method is used to print the object directly but we need to override it first
     * the above method from this comment is manually done whereas the method below from this comment is generated from the IDE
     * Can use both of them
     */

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                ", salary=" + salary +
                '}';
    }
}
