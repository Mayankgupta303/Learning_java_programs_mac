package OOPs.Abstraction;

public class Abstraction_01 {
    public static void main(String[] args) {
        Child c = new Child();
                c.loan50k();
                c.loan25k();
    }
}

abstract class Father{

    abstract void loan50k();

    void loan25k(){
        System.out.println("25K Given");}
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay");

    }
}
