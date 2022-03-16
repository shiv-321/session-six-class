package day16;

import java.util.Objects;

public class Student extends Person{
    private int rollNumber;

    public Student(String name, String age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void printDescription() {
        System.out.println("Student description");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + super.getName() +
                " age= " + super.getAge() +
                " rollNumber= " + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}


