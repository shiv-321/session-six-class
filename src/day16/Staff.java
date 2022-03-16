package day16;

public class Staff extends Person{
    private int staffId;

    public Staff(String name, String age) {
        super(name, age);
    }
    @Override
    public void printDescription() {
        System.out.println("Staff description");
    }
}
