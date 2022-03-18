package day13;

import java.time.LocalDate;

//sub class
public sealed class Manager extends Employee permits Executive{

    private double bonus;

   Manager(){

   }


    public Manager(String name, LocalDate localDate, double salary, double bonus) {
        super(name, localDate, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public final double getSalary() {

        return this.bonus + super.getSalary();
    }
    public String toString(){
        return super.getName() + "\t" + super.getLocalDate() + "\t" + super.getSalary() + "\t" + this.bonus;
    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                "name='" + super.getName() + '\'' +
//                ", localDate=" + super.getLocalDate() +
//                ", salary=" + super.getSalary() +
//                ", bonus=" + this.bonus +
//                '}';
//    }
}


