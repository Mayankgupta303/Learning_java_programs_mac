package OOPs.OOps_COnstructor;

public class DC_03 {
    public static void main(String[] args) {
        car s1 = new car();
        s1.name = "Tesla";
        System.out.println(s1.name);
        System.out.println(s1.year);
        System.out.println(s1.model);
    }


}

class car{
    String name;
    int year;
    String model;

    car(){
        name = "Scorpio";
        year = 2025;
        model = "Top";
    }
}