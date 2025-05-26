package OOPs.Exceptions;

public class handle_Exception {
    public static void main(String[] args) {
        int a= 0;
        try {
            a = 100/0;
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }
        System.out.println(a);
    }
}
