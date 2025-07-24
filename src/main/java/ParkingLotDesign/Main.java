package ParkingLotDesign;

import ParkingLotDesign.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> spots = Arrays.asList(
                new ParkingSpot(1, VehicleType.TWO_WHEELER),
                new ParkingSpot(2, VehicleType.FOUR_WHEELER),
                new ParkingSpot(3, VehicleType.FOUR_WHEELER)
        );

        ParkingLot lot = new ParkingLot(spots);

        Vehicle bike = new TwoWheeler("KA01AB1234");
        Vehicle car = new FourWheeler("KA01CD5678");

        lot.parkVehicle(bike);
        lot.parkVehicle(car);

        lot.unparkVehicle("KA01AB1234");
    }
}
