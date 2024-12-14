package DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDesc(){
        return coffee.getDesc() + "extra Milk";
    }

    public double getCost(){
        return coffee.getCost() + 5.0;
    }
}
