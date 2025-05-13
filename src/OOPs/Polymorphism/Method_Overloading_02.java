package OOPs.Polymorphism;

public class Method_Overloading_02 {
    public int add(int a , int b){
        return a+b;
    }
    public double add(double a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        Method_Overloading_02 c1 = new Method_Overloading_02();
        int M1 =  c1.add(3,4);
        double M2 = c1.add(3.144,4.56);
        System.out.println(M1);
        System.out.println(M2);
    }



}
