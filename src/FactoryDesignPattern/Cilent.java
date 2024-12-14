package FactoryDesignPattern;

public class Cilent {
    public static void main(String[] args) {
        ShapeFactory shapeFactory  = new ShapeFactory();

        Shape circle =  shapeFactory.makeShape("circle");

        circle.create();


        Shape rectangle =  shapeFactory.makeShape("rectangle");

        rectangle.create();
    }
}
