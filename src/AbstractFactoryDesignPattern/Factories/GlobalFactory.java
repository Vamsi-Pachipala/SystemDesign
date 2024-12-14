package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.CarTypes.Sedan;
import AbstractFactoryDesignPattern.CarTypes.Shift;

public interface GlobalFactory {
    Sedan createSedan();

    Shift createShift();
}
