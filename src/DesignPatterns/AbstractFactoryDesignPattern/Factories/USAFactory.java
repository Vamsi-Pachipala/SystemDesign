package DesignPatterns.AbstractFactoryDesignPattern.Factories;

import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.USASedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.USAShift;

public class USAFactory implements GlobalFactory {


    @Override
    public Sedan createSedan() {
        return new USASedan();
    }

    @Override
    public Shift createShift() {
        return new USAShift();
    }
}
