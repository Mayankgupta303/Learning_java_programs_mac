package OOPs.Generics;

public class Generics_01 {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum(3.45,4.33);
        temp_sum("Mayank" , "Gupta");
    }

    static <T> T temp_sum(T a , T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
