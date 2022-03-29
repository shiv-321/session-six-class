package day24B;

import java.util.*;
import java.util.logging.Logger;

public class IteratorPractice {
    public static void main(String[] args) {

       // ArrayList<String > stringsArrayList = new ArrayList<>();
        // we can also write this way because collection is parent collection
        Collection<String > stringsArrayList = new ArrayList<>();

        stringsArrayList.add("A");
        stringsArrayList.add("B");
        stringsArrayList.add("C");
        stringsArrayList.add("D");
        stringsArrayList.add("E");
        stringsArrayList.add("E");

        Logger.getGlobal().info(String.valueOf(stringsArrayList));

        // to change one collection type to another
        Collection<String> noDuplicateStringList = new HashSet<>(stringsArrayList);
        Logger.getGlobal().info(String.valueOf(noDuplicateStringList));


        Iterator<String> iterator = stringsArrayList.iterator();
        /*String s = iterator.next();
        String s1 = iterator.next();
        String s2 = iterator.next();
        String s3 = iterator.next();
        String s4 = iterator.next();
        String s5 = iterator.next(); // NOSuchElementException error is occured
         */
       /* while(iterator.hasNext()){
            String item = iterator.next();
            Logger.getGlobal().info(String.valueOf(item));
        }

        */

        // if we use while loop we will not face such exception like in the above case.
        // can also d0 using for each loop
        for (String item :stringsArrayList){
            Logger.getGlobal().info(String.valueOf(item));
        }
        boolean contains = stringsArrayList.contains("A");
        Logger.getGlobal().info(String.valueOf(contains));

        // contains work in case of string, but it does not work with the class made us
        // Because contains ckeck equal method so in case of String equal method implemented internally
        // in case of Student class we need to generate equal and hashCode method and will give correct answer

//        Collection<Student > students = new ArrayList<>();
//        students.add(new Student("A", 1));
//        students.add(new Student("B", 2));
//        students.add(new Student("C", 3));
//        students.add(new Student("D", 4));
//        students.add(new Student("E", 5));
//
//        boolean studentContain = students.contains(new Student("A", 1));
//        Logger.getGlobal().info(String.valueOf(studentContain));
//
//        Logger.getGlobal().info(String.valueOf(students.isEmpty()));
//
//        students.clear();
//        Logger.getGlobal().info(String.valueOf(students));


        // TreeSet collection uses compare to method as a parameter.
        // this method can be used if we can't make comparable method in the class
        Collection<Student > students = new TreeSet<Student>(Comparator.comparing(Student::getName));
        students.add(new Student("A", 1));
        students.add(new Student("C", 3));
        students.add(new Student("D", 4));
        students.add(new Student("E", 5));
        students.add(new Student("A", 1));
        students.add(new Student("B", 2));

        Logger.getGlobal().info(String.valueOf(students));
    }
}
