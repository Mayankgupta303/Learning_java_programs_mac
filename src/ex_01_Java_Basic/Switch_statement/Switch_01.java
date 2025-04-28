package ex_01_Java_Basic.Switch_statement;

import java.util.Scanner;

public class Switch_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7):- ");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tues");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thrus");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

    }
}
