public class Main {
    public static void main(String[] args) {
        Car car = new Car("AK3123", "Toyota");
        Truck truck = new Truck("ky789", 6.0);
        Bicycle bicycle = new Bicycle("Mountain Bike");

        FleetManager fleetManager = new FleetManager();
        fleetManager.addVehicle(car);
        fleetManager.addVehicle(truck);
        fleetManager.addVehicle(bicycle);

        fleetManager.listVehicles();

    }
}