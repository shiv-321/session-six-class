package day23A;

public class Pair1<T>{
    private T key;
    private T value;

    public Pair1(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }
    public T getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
