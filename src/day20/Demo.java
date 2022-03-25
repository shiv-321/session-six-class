package day20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Test obj = new Test();

        //creating class object from the object using getClass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " + cls.getName());

        // getting the constructor of the class through the object of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " + constructor.getName());

        // getting methods of the class through the object of the class by using getMethods
        Method[] methods = cls.getMethods();
        System.out.println("The public methods of class are: ");

        for (Method method : methods){
            System.out.println(method.getName());

        //creates object of desired method by providing the method name and parameter class as arguments to the geDeclaredMethod
        Method methodCall1 = cls.getDeclaredMethod("method2", int.class);

            // invokes the method at runtime
            methodCall1.invoke(obj, 19);

        // creates object of the desired field by providing the name of field as argument to the getDeclaredField method
            Field field = cls.getDeclaredField("s");
            field.setAccessible(true);

        // allows the object to access the field irrespective of the access specifier used with the field

        // takes object and the new value to be assigned to the field as arguments

        field.set(obj, "JAVA");


            // Creates object of desired method by providing the
            // method name as argument to the getDeclaredMethod
            Method methodcall2 = cls.getDeclaredMethod("method1");

            // invokes the method at runtime
            methodcall2.invoke(obj);

            // Creates object of the desired method by providing
            // the name of method as argument to the
            // getDeclaredMethod method
            Method methodcall3 = cls.getDeclaredMethod("method3");

            // allows the object to access the method irrespective
            // of the access specifier used with the method
            methodcall3.setAccessible(true);

            // invokes the method at runtime
            methodcall3.invoke(obj);


        }



    }


}
