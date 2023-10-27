import interfaces.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private final List<Vehicle> vehicles =new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    };
    void listVehicles(){
        for (Vehicle vehicle : vehicles) {
            System.out.println("Pojazd: " + vehicle.getClass().getSimpleName());
            vehicle.start();
            vehicle.drive();
            vehicle.stop();
            vehicle.refuel();
            System.out.println();
        }
    };
}
