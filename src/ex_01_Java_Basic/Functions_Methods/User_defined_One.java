package ex_01_Java_Basic.Functions_Methods;

public class User_defined_One {
    public static void main(String[] args) {

        int r = Sum_of_two_numbers(5, 4);
        int r2 = Sum_of_two_numbers(100 , 200);
        System.out.println(r);
        System.out.println(r2);

    }
    static  int Sum_of_two_numbers(int a , int b){
        return a+b;
    }
}
