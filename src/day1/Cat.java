package day1;

public class Cat {

    // states
    //name
    //age
    //color
    //weight
     /*
     * Instance variables: states of Cat
     */
    private String name;
    private int age;
    private String color;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Behaviour
    //eats
    //sleep
    //plays

    /*
    Instance methods: behaviors of Cat
    */
    private void meow(){

        System.out.println("Meow");
    }
    void eats(){

        System.out.println("Eating");
        meow();
    }
    void sleep(){

        System.out.println("sleeping");
    }
    void plays(){

        System.out.println("playing");
        meow();
    }
}
