package AbstractFactoryDesignPattern.CarTypes;

public class USAShift implements Shift{

    @Override
    public void design() {
        System.out.println("usa shift design completed");
    }

    @Override
    public void manufacture() {
        System.out.println("usa shift manufacturing completed");
    }
}
