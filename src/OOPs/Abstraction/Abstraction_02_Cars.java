package OOPs.Abstraction;

public class Abstraction_02_Cars {
    public static void main(String[] args) {
        Audi car = new Audi();
        car.drive();

    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}

class Audi extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop the Car");
    }
    void drive(){
        startEngine();
        stopEngine();
    }
}
