package DecoratorPattern;

public class Client {
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();

        System.out.println(coffee.getDesc()+ " " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDesc()+ " " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDesc()+ " " + coffee.getCost());
    }
}
