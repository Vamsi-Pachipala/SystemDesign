package AdapterPattern;

public class MediaPlayerAdapter implements MediaPlayer{

    @Override
    public void play(String type, String fileName) {
        AdvanceMediaPlayer advanceMediaPlayer;
        if(type.equals("mp4")){
            advanceMediaPlayer = new Mp4Player();
            advanceMediaPlayer.play(fileName);
        }
        if(type.equals("vlc")){
            advanceMediaPlayer = new VLCPlayer();
            advanceMediaPlayer.play(fileName);
        }
    }
}
