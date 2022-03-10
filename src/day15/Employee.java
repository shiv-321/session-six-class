package day15;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int age;
    private LocalDate hireDate;
    private  float salary;

    public Employee(String name, int age, LocalDate hireDate, float salary) {
        this.name = name;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public float getSalary() {
        return salary;
    }
}
