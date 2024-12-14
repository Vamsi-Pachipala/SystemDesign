package AbstractFactoryDesignPattern.CarTypes;

public class USASedan implements Sedan{
    @Override
    public void design() {
        System.out.println("usa sedan design completed");
    }

    @Override
    public void manufacture() {
        System.out.println("usa sedan manufacturing completed");
    }
}
