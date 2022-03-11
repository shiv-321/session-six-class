package day14;
abstract class A{
    abstract void display();
    void show(){
        System.out.println("Show method");
    }
}
abstract class B extends A{
    void display(){
        System.out.println("Abstract Method in A");
    }
    void shows(){
        System.out.println("Shows method in B");
    }
    abstract void startNow();
}

class C extends B{
    void startNow(){
        System.out.println("startNow method in class C");
    }
}
public class AbstractPractice {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.display();
//        obj.show();
//        obj.shows();

        C obj = new C();
        obj.startNow();
        obj.display();
        obj.show();
        obj.shows();
    }

}
