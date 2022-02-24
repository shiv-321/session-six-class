package day8;

public class ExplicitTypeConversion {
    public static void main(String[] args) {
        double d = 10.0;
        float f = (float) d; //explicit typecasting is required
        long l = (long)f;
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b) ;

    }
}
