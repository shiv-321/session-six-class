package day2;

import java.util.logging.Logger;

public class EncapsulationPractice {
    public static void main(String[] args) {
        Employee employee101 = new Employee();
        employee101.setName("Bob");
        employee101.setLicenseNumber("123321123321");
        employee101.setSalary(5554.55f);
        employee101.setSocialSecurityNumber("111223333");

        Logger.getGlobal().info(employee101.getName());
        Logger.getGlobal().info(employee101.getLicenseNumber());
        Logger.getGlobal().info(String.valueOf(employee101.getSalary()));
//        Logger.getGlobal().info(employee101.getSocialSecurityNumber());


    }
}
