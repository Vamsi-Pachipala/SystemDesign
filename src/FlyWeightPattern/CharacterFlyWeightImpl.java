package FlyWeightPattern;

public class CharacterFlyWeightImpl implements CharacterFlyWeight{


    @Override
    public void render(int x, int y, char c) {
        System.out.println("rendering "+c +" at "+x+ " "+y);
    }
}
