package day15;

import java.time.LocalDate;

public non-sealed class Executive extends Manager{

    public Executive(String name, int age, LocalDate hireDate, float salary, float bonus) {
        super(name, age, hireDate, salary, bonus);
    }
}
