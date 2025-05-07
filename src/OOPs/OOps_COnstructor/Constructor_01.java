package OOPs.OOps_COnstructor;

public class Constructor_01 {
    public static void main(String[] args) {

        baby b1 = new baby();
        new baby();
    }

}

class baby{

    String name;

    // Behaviour

    void cry(){
        System.out.println("Cry!!");
    }
    void sleep(){
        System.out.println("Sleep!!");
    }
    void eat(){
        System.out.println("Eat!!");
    }
    baby(){
        System.out.println("Default Constructor");
    }
}