package BuilderDesingPattern;

public class Client {

    public static void main(String[] args) {
        // Using the builder to create a House
        House house = new House.HouseBuilder()
                .setFoundation("Concrete Foundation")
                .setStructure("Wooden Structure")
                .setRoof("Tile Roof")
                .setGarage(true)
                .setSwimmingPool(true)
                .build();

        System.out.println(house);

        // Creating another House with different attributes
        House simpleHouse = new House.HouseBuilder()
                .setFoundation("Simple Foundation")
                .setStructure("Brick Structure")
                .setRoof("Metal Roof")
                .build();

        System.out.println(simpleHouse);
    }
}
