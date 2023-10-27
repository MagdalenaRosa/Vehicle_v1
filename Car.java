public class Car extends MotorVehicle{

    String marka="";

//    konstructor

    public Car(String registrationNumber,String marka) {
        super(registrationNumber);
        this.marka=marka;
    }

    @Override
    public void drive() {
        System.out.println("Samochód marki " + marka +" jedzie");

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }
}
