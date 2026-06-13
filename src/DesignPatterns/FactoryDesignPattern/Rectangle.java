package DesignPatterns.FactoryDesignPattern;

public class Rectangle implements Shape{
    @Override
    public void create() {
        System.out.println("drawing rectangle");
    }
}
