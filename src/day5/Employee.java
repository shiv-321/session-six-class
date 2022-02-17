package day5;

import java.util.logging.Logger;

public class Employee {
    private String name;
    private float salary;
    private String phoneNumber;
    private String licenseNumber;

    public Employee(){
        Logger.getGlobal().info("Default constructor called");
        this.name = "";
        this.salary = 0;
        this.phoneNumber = "";
        this.licenseNumber = "";
    }
    public Employee(String name, float salary, String phoneNumber){
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        Logger.getGlobal().info("First parameterized constructor");

    }
    public Employee(String name, float salary, String phoneNumber, String licenseNumber){
        Logger.getGlobal().info("Second parameterized constructor");
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
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
