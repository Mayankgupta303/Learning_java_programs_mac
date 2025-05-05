package ex_01_Java_Basic.Arrays;

public class Odd_EVEN_arra {
    public static void main(String[] args) {
        int [] num = {2,4,5,6,7,8,9,1900,45,890,13,12};

        for (int i:num) {
            if (i%2==0) {
                System.out.println("The Number "+i+" is even ");
            } else {
                System.out.println("The Number "+i+" is Odd ");
            }

        }
    }
}
