package ex_01_Java_Basic.While_Loop;

import java.util.Scanner;

public class fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        int first = 0 , second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 1; i <n ; i++) {
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;

        }


    }
}
