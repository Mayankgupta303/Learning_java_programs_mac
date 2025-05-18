package OOPs.Abstraction;

public class Abstraction_Interface  {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getarea(10,20);
    }
}

interface Polygon{
    void getarea(int lenght , int breadth);
}

class Rectangle implements Polygon{

    @Override
    public void getarea(int lenght, int breadth) {
        System.out.println("The area of Rectangle is " + (lenght*breadth));
    }
}
