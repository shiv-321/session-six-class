package day21B;
// Java program to Demonstrate Nested class
class Outer{

    class Inner{
        public void show(){

            System.out.println("In a nested class method");
        }
    }
}
public class InnerClassPractice {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
/**
 * Note how inner class object is created inside main() method
 *
 */
