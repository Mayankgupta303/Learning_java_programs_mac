package ex_01_Java_Basic.Arrays;

public class Sum_of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;
        System.out.println(" ---");
        for (int i = 0; i < numbers.length ; i++) {
                sum = sum + numbers[i];
    }
        System.out.println(sum);
    }
}
