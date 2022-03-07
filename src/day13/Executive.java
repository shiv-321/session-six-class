package day13;

import java.time.LocalDate;

public final class Executive extends Manager {


    public Executive(String name, LocalDate localDate, double salary, double bonus) {
        super(name, localDate, salary, bonus);
    }

//    @Override
//    public double getSalary() {
//        return super.getBonus() + super.getSalary();}


}
