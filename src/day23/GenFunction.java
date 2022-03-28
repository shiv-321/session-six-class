package day23;
// java program to show working of user define generic functions
public class GenFunction {
    // A generic method example
    static<T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // calling generic method with Integer argument
        genericDisplay(11);
        // calling generic method with String argument
        genericDisplay("GeeksforGeeks");
        //calling generic method with double argument
        genericDisplay(1.0);
    }
}
