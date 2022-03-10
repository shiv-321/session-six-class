package day15;

import java.time.LocalDate;

public sealed class Manager extends Employee permits Executive{

    private float bonus;

    public Manager(String name, int age, LocalDate hireDate, float salary, float bonus) {
       super(name, age, hireDate, salary);
        this.bonus = bonus;
    }
    public float getBonus() {
        return bonus;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + this.bonus;
    }
}
