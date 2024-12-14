package DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee{

    Coffee coffee;
    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDesc(){
        return coffee.getDesc();
    }

    public double getCost(){
        return coffee.getCost();
    }
}
