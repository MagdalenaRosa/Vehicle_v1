import interfaces.Vehicle;

public class Bicycle implements Vehicle {

    String model;
    public Bicycle(String model){
        this.model=model;
    }
    @Override
    public void start() {
        System.out.println("Rower maodel "+model+" jedzie");

    }

    @Override
    public void stop() {
        System.out.println("Rower maodel "+model+" stoi");


    }

    @Override
    public void refuel() {
        System.out.println("Rower maodel "+model+" ładuje się");


    }

    @Override
    public void drive() {


    }
}
