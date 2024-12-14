package AbstractFactoryDesignPattern.CarTypes;

public class IndianSedan implements Sedan{
    @Override
    public void design() {
        System.out.println("indian sedan design completed");
    }

    @Override
    public void manufacture() {
        System.out.println("indian sedan manufacturing completed");
    }
}
