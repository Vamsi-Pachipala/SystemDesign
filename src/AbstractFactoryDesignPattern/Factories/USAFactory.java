package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.CarTypes.Sedan;
import AbstractFactoryDesignPattern.CarTypes.Shift;
import AbstractFactoryDesignPattern.CarTypes.USASedan;
import AbstractFactoryDesignPattern.CarTypes.USAShift;

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
