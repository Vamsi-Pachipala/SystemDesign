package DesignPatterns.AbstractFactoryDesignPattern;

import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import DesignPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;
import DesignPatterns.AbstractFactoryDesignPattern.Factories.GlobalFactory;
import DesignPatterns.AbstractFactoryDesignPattern.Factories.IndianFactory;
import DesignPatterns.AbstractFactoryDesignPattern.Factories.USAFactory;

public class Client {
    public static void main(String[] args) {
        GlobalFactory usaFactory = new USAFactory();

        // Create USA-specific cars
        Sedan usaSedan = usaFactory.createSedan();
        Shift usaShift = usaFactory.createShift();

        // Design and manufacture USA cars
        usaSedan.design();
        usaSedan.manufacture();
        usaShift.design();
        usaShift.manufacture();

        System.out.println("-----");

        // Create a factory for India cars
        GlobalFactory indiaFactory = new IndianFactory();

        // Create India-specific cars
        Sedan indiaSedan = indiaFactory.createSedan();
        Shift indianShift = indiaFactory.createShift();

        // Design and manufacture India cars
        indiaSedan.design();
        indiaSedan.manufacture();
        indianShift.design();
        indianShift.manufacture();
    }
}
