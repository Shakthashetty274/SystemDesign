package StrategyPattern;

import StrategyPattern.Strategy.SpecialCapability;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialCapability());
    }
}
