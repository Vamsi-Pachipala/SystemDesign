package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.CarTypes.IndianSedan;
import AbstractFactoryDesignPattern.CarTypes.IndianShift;
import AbstractFactoryDesignPattern.CarTypes.Sedan;
import AbstractFactoryDesignPattern.CarTypes.Shift;

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
