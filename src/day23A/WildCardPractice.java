package day23A;

public class WildCardPractice {
    public static void main(String[] args) {

        Pair1<Integer> pair1 = new Pair1<>(1, 1000);
        Pair1<Float> pair2 = new Pair1<>(1f, 2000f);
        Pair1<String> pair3 = new Pair1<>("Name", "Shiv");

        printPair(pair1);
        printPair(pair2);
//        printPair(pair3);


    }
    public static void printPair(Pair1<? extends Number> pair1){
        System.out.println();

    }
}
