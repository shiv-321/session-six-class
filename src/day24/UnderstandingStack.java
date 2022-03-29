package day24;
// java program to demonstrate the working of a stack

import java.util.Iterator;
import java.util.Stack;

public class UnderstandingStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        //printing the stack
        while(itr.hasNext()){
            System.out.println(itr.next() +  " ");
        }
        System.out.println();
        stack.pop();

        //Iterator for the stack
        itr = stack.iterator();

        //printing the stack
        while (itr.hasNext()){
            System.out.println(itr.next() + " ");
        }


    }
}
