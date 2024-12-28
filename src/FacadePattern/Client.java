package FacadePattern;

public class Client {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, lights ,projector , soundSystem);

        homeTheatreFacade.watchMovie("Pokiri");
        homeTheatreFacade.endMovie("Pokiri");
    }
}
