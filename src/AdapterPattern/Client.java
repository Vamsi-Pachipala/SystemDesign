package AdapterPattern;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3" , "play.mp3");
        audioPlayer.play("mp4" , "play.mp4");
        audioPlayer.play("vlc" , "play.vlc");
    }
}
