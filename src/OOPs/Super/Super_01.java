package OOPs.Super;

public class Super_01 {
    public static void main(String[] args) {

    }
}

class Animal{
    protected String color = "White";
}

class dog extends Animal{
    private String colour = "Black";

    void display(){
        System.out.println(this.colour);
       // System.out.println(super.colour);
    }
}
