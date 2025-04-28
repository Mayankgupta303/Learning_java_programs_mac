package ex_01_Java_Basic.For.Loop;

public class For_loop_odd_even {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i%2 == 0){
                System.out.println("Even No. -> " + i);
                continue;
            }
            System.out.println("Odd -> " +i);

        }
    }
}
