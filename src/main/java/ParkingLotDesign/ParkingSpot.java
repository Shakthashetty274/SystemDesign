package ParkingLotDesign;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType spotType; // what type it supports
    private boolean isOccupied;
    private Vehicle currentVehicle;

    public ParkingSpot(int spotNumber, VehicleType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return !isOccupied && vehicle.getType() == spotType;
    }

    public void park(Vehicle vehicle) {
        this.currentVehicle = vehicle;
        this.isOccupied = true;
    }

    public void unpark() {
        this.currentVehicle = null;
        this.isOccupied = false;
    }
}
