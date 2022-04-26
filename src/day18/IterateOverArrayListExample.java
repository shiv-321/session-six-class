package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {

        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison Break");

        System.out.println("=== Iterate using forEach and lambda expression");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
                });

        System.out.println("=== Iterate using an iterator()===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            System.out.println(tvShowIterator.next());
        }

        System.out.println("=== Iterate using an iterator() and forEach() method");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            System.out.println(tvShowListIterator.previous());
        }

        System.out.println("=== Iterate using simple for each loop===");
        for(String tvShow:tvShows){
            System.out.println(tvShow);
        }

        System.out.println("=== Iterate using for loop with index ===");
        for(int i = 0; i<tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }

    }

}
