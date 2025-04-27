package ex_01_Java_Basic.Lab001_HelloWorldFrogram;

public class Lab005_ternary {
    public static void main(String[] args) {
        String age1 = args[2];

        int age = Integer.parseInt(age1);

        String result =  (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior" ;
        System.out.println(result);
    }
}
