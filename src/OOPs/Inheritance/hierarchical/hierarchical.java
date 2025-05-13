package OOPs.Inheritance.hierarchical;

public class hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Mayank m1 = new Mayank();
        Mayank2 m2 = new Mayank2();

        f1.home();
        m1.home();
        m2.home();
        m2.m2();


    }
}

class Father{
    void home(){
        System.out.println("3 BHK");
    }
}

class Mayank extends Father {
    void m1(){
        System.out.println("h1  - Mayank");
    }
}

class Mayank2 extends Father{
    void m2(){
        System.out.println("h2 - Mayank");
    }
}

class Mayank3 extends Father{
    void m3(){
        System.out.println("h3 - Mayank");
    }
}