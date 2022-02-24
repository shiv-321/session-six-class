package day1;

public class CatPractice {
    public static void main(String[] args) {
        //creating objects
        Cat thor = new Cat();
        Cat rambo = new Cat();

        //defining thor cat //allocating memory
//        thor.name = "Thor";
        thor.setName("Thor");
//        thor.age = 2;
        thor.setAge(2);
//        thor.color = "Black";
        thor.setColor("Black");
//        thor.weight = 2.5f;
        thor.setWeight(2.5f);
//        thor.sleep();

        //defining rambo cat
//        rambo.name = "Rambo";
        rambo.setName("Rambo");
//        rambo.age = 3;
        rambo.setAge(3);
//        rambo.color = "White";
        rambo.setColor("White");
//        rambo.weight = 3.0f;
        rambo.setWeight(3.0f);
//        rambo.plays();

        System.out.println("Information about cat thor");
//        String thorName = thor.name;
        String thorName = thor.getName();
        System.out.println(thorName);

//        int thorAge = thor.age;
        int thorAge = thor.getAge();
        System.out.println(thorAge);

//        String thorColor = thor.color;
        String thorColor = thor.getColor();
        System.out.println(thorColor);

//        float thorWeight = thor.weight;
        float thorWeight = thor.getWeight();
        System.out.println(thorWeight);

        System.out.println("Information about cat rambo");
//        String ramboName = rambo.name;
        String ramboName = rambo.getName();
        System.out.println(ramboName);

//        int ramboAge = rambo.age;
        int ramboAge = rambo.getAge();
        System.out.println(ramboAge);

//        String ramboColor =rambo.color;
        String ramboColor =rambo.getColor();
        System.out.println(ramboColor);

//        float ramboWeight = rambo.weight;
        float ramboWeight = rambo.getWeight();
        System.out.println(ramboWeight);

//        thor.meow;
//        thor.sleep();
    }
}
