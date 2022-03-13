package day15;

import java.time.LocalDate;
import java.util.logging.Logger;

public class AccountingInheritance {
    public static void main(String[] args) {

        Manager boss = new Manager("Rabina", 50, LocalDate.now(), 5000, 2000);

        Employee employee1 = new Employee("Subina", 28, LocalDate.now(), 4000);


//        Logger.getGlobal().info(String.valueOf(boss.getSalary()));

//        Logger.getGlobal().info(String.valueOf(employee1.getSalary()));

        //polymorphism (compile time)
        AccountingInheritance accounting = new AccountingInheritance();
        accounting.add(2, 3);
        accounting.add(2, 3, 4);



        //polymorphism (runtime)
        Employee boss2 = new Manager("IJK", 60, LocalDate.now(), 75000, 5000);
//        boss2.getBonus();
//        ((Manager)boss2).getBonus();
//        ((Manager)employee1).getBonus();

        if (employee1 instanceof Manager) {
            ((Manager) employee1).getBonus();
        }   // check is our casting is good or not

        Logger.getGlobal().info(String.valueOf(boss2.getSalary()));
        Logger.getGlobal().info(String.valueOf(((Manager)boss2).getBonus()));


        accounting.printSalary(employee1);
        accounting.printSalary(boss);



    }
    public void add(int a, int b){}

    public void add(int a, int b, int c){}

//    public void printSalary(Manager manager){
//        System.out.println(manager.getSalary());
//    }
    public void printSalary(Employee employee){
        System.out.println(employee.getSalary());
    }

}
