public class Truck extends MotorVehicle{

    double ladownosc_pojazdu;

    public Truck(String registrationNumber, double ladownosc_pojazdu) {
        super(registrationNumber);
        this.ladownosc_pojazdu = ladownosc_pojazdu;
    }

    @Override
    public void drive() {
        System.out.println("Ciężarówka z ładunkiem "+ ladownosc_pojazdu+ " jedzie");

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
