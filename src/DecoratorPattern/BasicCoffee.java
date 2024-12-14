package DecoratorPattern;

public class BasicCoffee implements Coffee{
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDesc() {
        return "this is base basic coffee";
    }
}
