package day22A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        try{
            int age = sc.nextInt();
            if (age<18){
                throw new AgeRestrictionException("You can't register if you are below 18 years");
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (AgeRestrictionException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
