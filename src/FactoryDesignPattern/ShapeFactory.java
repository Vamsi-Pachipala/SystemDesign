package FactoryDesignPattern;

public class ShapeFactory{

    Shape makeShape(String shapeType){
        switch (shapeType){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default: return null;
        }
    }
}
