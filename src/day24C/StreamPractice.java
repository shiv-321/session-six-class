package day24C;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {


        //creating strea,
        List<Integer> numbers = Arrays.asList(1,2,4,3,2,5,6,7,8,9,10);
        Stream<Integer> numberStream = numbers.stream();

        // direct creating stream
//    Stream<Integer> realNumberStream = Stream.of(1,4,3,2,5,6,7,8,910);
        //Map
//        List<Integer> newList = numberStream
//                .map(n ->n*n)
//                .collect(Collectors.toList());
//        System.out.println(newList);


        //Filter and sort
        List<Integer>filterList = numberStream
                .peek(e ->System.out.println("The numbers are: " + e))
                .filter(n-> n%2 ==0)

                .sorted()
                .distinct()
                .peek(e ->System.out.println("The even numbers are: " + e))
                .collect(Collectors.toList());
        System.out.println(filterList);

        //FlatMap

        //Distinct

        //Peek

        //Collect

        //AllMatch

        //AnyMatch

        //ForEach

        //

    }

}
