package FacadePattern;

public class HomeTheatreFacade {

    private DVDPlayer dvdPlayer;
    private Lights lights;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheatreFacade(DVDPlayer dvdPlayer, Lights lights, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");
        lights.dim(20);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(String movie) {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.dim(100);
        System.out.println(movie + "  stopped");
    }

}
