import interfaces.Vehicle;

public abstract class MotorVehicle implements Vehicle {
    public String registrationNumber;




    public MotorVehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
