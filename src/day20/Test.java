package day20;
// A simple java program to demonstrate the use of reflection
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;


public class Test {
    private String s;

    public Test(){
        s = "Texas";
    }
    public void method1(){
        System.out.println("The string is " + s);
    }

    public void method2(int n){
        System.out.println("The number is " + n);
    }
   private void method3(){
       System.out.println("Private method invoked");
   }

}
