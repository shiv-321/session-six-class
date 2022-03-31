package day23A;

public class GenericClassPractice {
    public static void main(String[] args) {

        Pair<String, String> pair0 = new Pair<>("name", "Shiv");
        Pair<Integer, Integer> pair1 = new Pair<>(1, 2);
        Pair<Float, Float> pair2 = new Pair<>(1.0f, 2.6f);
        Pair<String, Float> pair3 = new Pair<>("Aman", 2.6f);



        System.out.println(pair0);
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
