package OOPs.Static;

public class Static {
    public static void main(String[] args) {
       P p1 = new P();
       P p2 = new P();
    }
}
//             SIB --> 1 time class called one time
//             IIB --> 2 times
//             DC  --> 2 times

class P{
    {
        System.out.println("IIb");
    }
    P(){
        System.out.println("DC");
    }

    static {
        System.out.println("SIB");
    }
}
