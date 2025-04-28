package ex_01_Java_Basic.Switch_statement;

import java.util.Scanner;

public class Switch_JDK13Above {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7):- ");
        int day = scanner.nextInt();

        switch (day) {

            case 1 -> System.out.println("Mon");

            case 2 -> System.out.println("Tues");

            case 3 -> System.out.println("Wed");

            case 4 -> System.out.println("Thrus");

            case 5 -> System.out.println("Fri");

            case 6 -> System.out.println("Sat");

            case 7 -> System.out.println("Sun");

            default -> System.out.println("Invalid input");
        }

    }


}