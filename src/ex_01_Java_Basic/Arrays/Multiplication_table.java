package ex_01_Java_Basic.Arrays;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i*j + " \t ");

            }
            System.out.println();

        }
    }
}
