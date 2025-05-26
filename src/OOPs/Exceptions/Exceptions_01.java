package OOPs.Exceptions;

public class Exceptions_01 {
    public static void main(String[] args) {
        System.out.println("Starting the Program");
        String Input_user = args[0];                     // divide by 0 is not posssible that why exception is occurs
        int a = Integer.parseInt(Input_user);
        int ouput = 100/a;
        System.out.println(ouput);
    }
}


// java. lang. ArithmeticException: / by zero when args -> 0
// java. lang. NumberFormatException: For input string: "pramod"
// java. lang•ArrayIndexOutOfBoundsException: Index 0 out of bounds