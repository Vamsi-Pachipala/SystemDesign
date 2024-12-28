package FlyWeightPattern;

import java.util.HashMap;

public class CharacterFactory {

    HashMap<Character ,CharacterFlyWeight> cache;

    CharacterFactory(){
        cache = new HashMap<>();
    }

    CharacterFlyWeight getObj(char c){
        cache.putIfAbsent(c , new CharacterFlyWeightImpl());
        return cache.get(c);
    }
}
