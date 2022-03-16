package day16;

public class SchoolManagementApp {
    public static void main(String[] args) {
//     Person person = new Person("Rob", "50"); // not allowed
//     person.printDescription();
     Student student = new Student("Rob", "50", 1);
     Student student1 = new Student("Rob", "40", 1);
        System.out.println(student.toString());
        System.out.println(student1.toString());

        System.out.println(student == student1);
        System.out.println(student.equals(student1));

//     student.printDescription();
     Teacher teacher = new Teacher("Rob", "50");
//        System.out.println(teacher.toString());
//     teacher.printDescription();
     Staff staff = new Staff("Rob", "50");
//        System.out.println(staff.toString());
//     staff.printDescription();
    }
}
