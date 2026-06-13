package DesignPatterns.AbstractFactoryDesignPattern.Factories;

import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;

public interface GlobalFactory {
    Sedan createSedan();

    Shift createShift();
}
