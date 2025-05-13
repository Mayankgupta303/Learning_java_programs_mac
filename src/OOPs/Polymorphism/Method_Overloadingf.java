package OOPs.Polymorphism;

public class Method_Overloadingf {
    public static void main(String[] args) {

        Mathoperations m1 = new Mathoperations();
        int r1 =  m1.add(3,4);
        int r2 =  m1.add(3,4,3);
        double r3 = m1.add(3.50,2.90);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}

class Mathoperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

}
