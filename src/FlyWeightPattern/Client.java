package FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();


        String needToType = "Hello Hello";
        int x = 0 , y = 0;
        for(char c : needToType.toCharArray()){
            CharacterFlyWeight characterFlyWeight = characterFactory.getObj(c);
            characterFlyWeight.render(x++ , y , c);
        }

        System.out.println(characterFactory.cache.size());
    }
}
