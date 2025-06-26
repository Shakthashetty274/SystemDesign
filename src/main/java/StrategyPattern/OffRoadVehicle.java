package StrategyPattern;

import StrategyPattern.Strategy.NormalCapability;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalCapability());
    }
}
