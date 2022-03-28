package day23;
// Java program to show working of user defined Generic classes
// we use <> to specify parameter type

public class GenericTest<T> {
    T obj;
    GenericTest(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }

    public static void main(String[] args) {
        GenericTest<Integer> iobj = new GenericTest<Integer>(15);
        System.out.println(iobj.getObject());

        //instance of String type
        GenericTest<String> sobj = new GenericTest<>("GeeksForGeeks");
        System.out.println(sobj.getObject());
    }

}

/**
 * iObj = sObj; // This results an error
 * Even though iObj and sObj are of type Test,
 * they are the references to different types because their type parameters differ.
 * Generics add type safety through this and prevent errors.
 */