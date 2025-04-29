package ex_01_Java_Basic.While_Loop;

import java.util.Random;

public class Guess_game {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertoGuess = random.nextInt(10)+1;
        System.out.println(numbertoGuess);
    }
}
