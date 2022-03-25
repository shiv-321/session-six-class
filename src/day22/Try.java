package day22;

public class Try {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;
        //without try
//        int c = a/b;
//        System.out.println("Result is " + c);

        // with try
        try{
            int c = a/b;
            System.out.println("Result is " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");



    }
}
