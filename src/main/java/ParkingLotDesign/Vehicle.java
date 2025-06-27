package ParkingLotDesign;

import ParkingLotDesign.VehicleType;

public abstract class Vehicle {
    private String registrationNumber;
    private VehicleType type;

    public Vehicle(String registrationNumber, VehicleType type) {
        this.registrationNumber = registrationNumber;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
