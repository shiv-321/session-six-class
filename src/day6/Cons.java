package day6;

public class Cons {
    Cons(){
        System.out.println("I am constructor");
    }
    Cons(String name){
        System.out.println("My name is "+ name);
    }

    public static void main(String[] args) {
        Cons c = new Cons();
        Cons c1 = new Cons("Shivaraj");

    }
}

