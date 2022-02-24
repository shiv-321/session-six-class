package day8;

import jdk.swing.interop.SwingInterOpUtils;

public class ImplicitTypeConversion {
    public static void main(String[] args) {
        byte b = 0;
        short s = b;
        int i = s;
        long l = i;
        float f = l; // if we want to convert long to float there will be chance of data loss so better do it long to double
        double d =f;

        char ch1 = 'A';
        double d1 = ch1;

        String st = "Hello";
        System.out.println(st + 65); // output will be string because the string has the upper hand
        System.out.println("" + 65); // to convert integer to string



        System.out.println(b); // no explicit typecasting required
        System.out.println(s); // no explicit typecasting required
        System.out.println(i); // no explicit typecasting required
        System.out.println(l); // no explicit typecasting required
        System.out.println(f); // no explicit typecasting required
        System.out.println(d); // no explicit typecasting required
        System.out.println(d1); // no explicit typecasting required

    }
}
