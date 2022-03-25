package day21B;

public class OuterClass {
    int outerVariable = 100;

    private class InnerClass{
        int outerVariable = 200;

        void show(){
            System.out.println("Outer variable: " + OuterClass.this.outerVariable);
            System.out.println("Outer variable: " + outerVariable);
        }
}
        public static void main(String[] args) {
          // to create object of inner class
//            OuterClass outerClass = new OuterClass();
//            InnerClass innerClass = outerClass.new InnerClass();
            // OR
            InnerClass innerClass = new OuterClass().new InnerClass();
            innerClass.show();


        }
    }
