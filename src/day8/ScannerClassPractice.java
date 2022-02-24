package day8;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        String rollNumber = sc.nextLine();

        // Marks of 4 subjects
        System.out.println("Enter the marks of Physics: ");
        int marksPhysics = sc.nextInt();
        System.out.println("Enter the marks of Chemistry: ");
        int marksChemistry = sc.nextInt();
        System.out.println("Enter the marks of Biology: ");
        int marksBiology = sc.nextInt();
        System.out.println("Enter the marks of English: ");
        int marksEnglish = sc.nextInt();


        System.out.println("Name of the student: " + name);
        System.out.println("Roll number of the student: " + rollNumber);
        System.out.println("The marks of Physics: " + marksPhysics);
        System.out.println("The marks of Chemistry: " + marksChemistry);
        System.out.println("The marks of Biology: " + marksBiology);
        System.out.println("The marks of English: " + marksEnglish);
        percentage(marksPhysics, marksChemistry,marksBiology,marksEnglish);
        cgpa(marksPhysics, marksChemistry,marksBiology,marksEnglish);

    }
    public static void percentage(float Physic, float Chemistry, float Biology, float English){
        float percentage = (Physic+Chemistry+Biology+English)/4;
        System.out.println("The percentage of your marks is: " + percentage);
    }
    public static void cgpa(float Physics, float Chemistry, float Biology, float English){
        float cgpa = (Physics + Chemistry + Biology + English)/40;
        System.out.println("The CGPA of your marks is: " + cgpa);
    }

}
