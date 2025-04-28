package ex_01_Java_Basic.While_Loop;

import java.util.Scanner;

public class Factorial_whilw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program \n Enter the Number:- ");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number<=0){
            System.out.println(factorial);
        } else {
            for (int i =1 ; i<= number; i++ ){
                factorial = factorial *i;
            }
        }
        System.out.println("Factorial is -> " +factorial);
    }
}
