package ex_01_Java_Basic.Arrays;

import java.util.Scanner;

public class Left_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of arry(int) only:- ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j=1; j <= i ; j++){
               System.out.print("*");
    }
            System.out.println();


 }
    }
}
