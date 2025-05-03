package ex_01_Java_Basic.strings;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String s0 = "Hello";
        String s1 = new String("Hello");

        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
