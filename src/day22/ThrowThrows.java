package day22;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class ThrowThrows {
    public  static double area(int r)throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r *r;
        return result;

    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //uses divide function created by Harry
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
        }
        catch (Exception e){
            System.out.println(e);
        }





    }
}
