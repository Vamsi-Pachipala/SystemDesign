package AbstractFactoryDesignPattern.CarTypes;

public class IndianShift implements Shift{

    @Override
    public void design() {
        System.out.println("indian shift design completed");
    }

    @Override
    public void manufacture() {
        System.out.println("indian shift manufacturing completed");
    }
}
