package day21;
// Java program to demonstrate the real world example of Interfaces
import java.io.*;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBreaks(int a); // all are these abstract methods
}
class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}
class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

public class InterfacePractice2 {
    public static void main(String[] args) {
        //creating an instance of Bicycle doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBreaks(1);

        System.out.println("Bicycle present state: ");
        bicycle.printStates();

        //creating an instance of Bike
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBreaks(3);

        System.out.println("Bike present state: ");
        bike.printStates();

    }
}
