package StrategyPattern;

import StrategyPattern.Strategy.NormalCapability;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalCapability());
    }
}
