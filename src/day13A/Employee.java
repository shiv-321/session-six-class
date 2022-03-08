package day13A;

import day5.Gender;

import java.util.Objects;
import java.util.logging.Logger;

public class Employee {
    private String name;
    private float salary;
    private String phoneNumber;
    private String licenseNumber;
    private Gender gender; // Male, Female and Other

//    public Employee(){
//        this.name = "";
//        this.salary = 0;
//        this.phoneNumber = "";
//        this.licenseNumber = "";
//        Logger.getGlobal().info("Default constructor called");
//    }
    public Employee(String name, float salary, String phoneNumber, Gender gender){
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        Logger.getGlobal().info("First parameterized constructor");

    }
    public Employee(String name, float salary, String phoneNumber, Gender gender, String licenseNumber){
        this.name = Objects.requireNonNullElse(name, "");
        this.salary = salary;
        this.phoneNumber = Objects.requireNonNullElse(phoneNumber, "");
        this.licenseNumber = Objects.requireNonNullElse(licenseNumber, "");
        Logger.getGlobal().info("Second parameterized constructor");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void addBonus(Employee employee, float bonus){
        employee.salary = employee.salary + bonus;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}
