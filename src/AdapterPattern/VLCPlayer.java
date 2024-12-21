package AdapterPattern;

public class VLCPlayer implements AdvanceMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("playing vlc of -> "+fileName);

    }
}
