package day16;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String age) {
        super(name, age);
    }
    @Override
    public void printDescription() {
        System.out.println("Teacher description");
    }
}
