package day22;

public class Finally {
    public static int greet (){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this function");

        }
        return 0;
    }

    public static void main(String[] args) {
        greet();

    }

}
