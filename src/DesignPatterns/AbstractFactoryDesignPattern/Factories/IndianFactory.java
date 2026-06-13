package DesignPatterns.AbstractFactoryDesignPattern.Factories;

import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.IndianSedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.IndianShift;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;

public class IndianFactory implements GlobalFactory{


    @Override
    public Sedan createSedan() {
        return new IndianSedan();
    }

    @Override
    public Shift createShift() {
        return new IndianShift();
    }
}
