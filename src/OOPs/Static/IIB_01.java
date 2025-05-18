package OOPs.Static;

public class IIB_01 {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hello world");
    }
}
