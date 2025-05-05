package ex_01_Java_Basic.Arrays;

import java.util.Scanner;

public class Arrays_USer_INPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of arry(int) only: - ");
        int size = sc.nextInt();

        int[] numbers_marks = new int[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the numbers:- ");
            numbers_marks[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------");

        for (int i =0; i< numbers_marks.length ; i++){
            System.out.println(numbers_marks[i]);
        }
        sc.close();
    }
}
