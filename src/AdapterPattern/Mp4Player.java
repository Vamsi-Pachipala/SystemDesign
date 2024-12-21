package AdapterPattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("playing Mp4 of -> "+fileName);
    }
}
