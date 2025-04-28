package ex_01_Java_Basic.Switch_statement;

public class Switch_02_ASCII {
    public static void main(String[] args) {

        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("ASCII is match");
                break;
            default:
                System.out.println("Not Match");
        }
    }
}
