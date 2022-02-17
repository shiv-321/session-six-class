package day2;

public class School {
    public static void main(String[] args) {

        Students students = new Students();
        students.setName("ABC");
        students.setAge(30);
        students.setStudentClass(10);

        Teachers teachers = new Teachers();
        teachers.setName("XYZ");
        teachers.setAge(25);
        teachers.setSalary(5000.0f);
        teachers.setSubject("English");

        Staff staff = new Staff();
        staff.setName("JKL");
        staff.setAge(40);
        staff.setSalary(3000.0f);
        staff.setRole("Library Management");


        String studentName = students.getName();
        System.out.println(studentName);
        System.out.println(staff.getRole());




    }
}
