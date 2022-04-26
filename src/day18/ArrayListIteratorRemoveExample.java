package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(18);
        numbers.add(40);

        for (int i =0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println(numbers.contains(30));
        System.out.println(numbers.contains(25));
        System.out.println(numbers.indexOf(18));
        System.out.println(numbers.lastIndexOf(18));

        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if (num % 2 !=0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);


    }
}
