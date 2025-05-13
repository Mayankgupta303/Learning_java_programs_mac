package OOPs.Polymorphism;

public class Method_Overriding_01 {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
