package StrategyPattern.StrategyDesignPattern;

import StrategyPattern.SportsVehicle;
import StrategyPattern.Vehicle;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
