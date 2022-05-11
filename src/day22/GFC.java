package day22;
// java program to demonstrate need of try-catch clause

public class GFC {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0]= 100;
        // this statement causes an exception
        try{
            arr[4]= 400;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Hi, I want to execute");
        }



    }

}
