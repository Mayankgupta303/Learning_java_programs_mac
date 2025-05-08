package OOPs.Inheritance.multilevel.inher;

public class MultiLevel_inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.gf();
        s1.Father();
        s1.son();

        System.out.println("-------------");

        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println("-------------");

        Father f1 = new Father();
        f1.gf();
        f1.Father();
    }
}
