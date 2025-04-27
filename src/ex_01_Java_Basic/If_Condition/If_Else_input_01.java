package ex_01_Java_Basic.If_Condition;

import java.util.Scanner;

public class If_Else_input_01 {
    public static void main(String[] args) {
      //  int age = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You are allowed to go a GOA");
        } else {
            System.out.println("You Are not aloowed");
        }

    }

}
