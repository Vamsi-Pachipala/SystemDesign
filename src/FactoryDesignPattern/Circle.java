package FactoryDesignPattern;

public class Circle implements Shape{
    @Override
    public void create() {
        System.out.println("Drawing circle");
    }
}
