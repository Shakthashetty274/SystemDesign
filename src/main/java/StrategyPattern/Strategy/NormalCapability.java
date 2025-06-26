package StrategyPattern.Strategy;

public class NormalCapability implements DriveStrategy {
    public void drive(){
        System.out.println("Normal Strategy");
    }
}
