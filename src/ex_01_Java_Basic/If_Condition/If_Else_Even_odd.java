package ex_01_Java_Basic.If_Condition;

import java.util.Scanner;

public class If_Else_Even_odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:- ");
        int num = scanner.nextInt();

        if (num %2 == 0){
            System.out.println("The Given Number is Even");
        } else {
            System.out.println("The Given Number is Odd");
        }


    }
}
