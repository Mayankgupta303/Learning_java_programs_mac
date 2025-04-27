package ex_01_Java_Basic;

public class ternary_op {
    public static void main(String[] args) {
        int num = 27;
        String result = (num > 10) ? (num > 20 ? "N>20" : "N<20") : "B" ;
        System.out.println(result);
    }
}
