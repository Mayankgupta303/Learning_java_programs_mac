package OOPs.Inheritance.Single_Inheritance;

public class Inheritance_01_Single {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.bhk3();
        System.out.println(s1.gold);
        s1.bhk2();

    }
}

class father{
    int gold = 1000;

    void bhk2(){
        System.out.println("Father - 2BHK");
    }
}

class Son extends father {
    void bhk3(){
        System.out.println("Son- 3BHK");
    }
}
