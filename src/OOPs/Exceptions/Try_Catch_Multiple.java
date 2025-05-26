package OOPs.Exceptions;

public class Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Are you Fool");
        } catch (Exception e) {
            System.out.println("Are You Fool");;
        }
        System.out.println("2");
    }
}
