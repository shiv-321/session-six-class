package day14;
interface A1{
    void Adisplay();
    void Ashow();
}
interface B1{
    void Bdisplay();
    void Bshow();
}

class AB implements A1,B1{
    public void Adisplay(){
        System.out.println("A Display");
    }

    @Override
    public void Ashow() {
        System.out.println("A show");
    }

    @Override
    public void Bdisplay() {
        System.out.println("B display");
    }

    @Override
    public void Bshow() {
        System.out.println("B show");
    }
}
public class InterfacePractice {
    public static void main(String[] args) {
       AB obj = new AB();
        obj.Adisplay();
        obj.Ashow();
        obj.Bdisplay();
        obj.Bshow();
    }

}
