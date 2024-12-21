package AdapterPattern;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String type , String fileName) {
        if(type.equals("mp3")){
            System.out.println("i can handle mp3 ..so Playing  audio -> "+fileName);
        }
        else{
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter();
            mediaPlayerAdapter.play(type , fileName);
        }
    }
}
