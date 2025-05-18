package OOPs.Static;

public class Static_02 {
    public static void main(String[] args) {

        B.CommontoAll();
    }
}

class B{
    static {
        System.out.println("SIB , called once when class is loaded");
    }

    int a = 10;
    static int b = 10;

    void display(){
        System.out.println("Non Static F(n)");
    }

    static void CommontoAll(){
        System.out.println("Static F(n)");
    }

//    static class C{
//        Not usefull
//    }
}
