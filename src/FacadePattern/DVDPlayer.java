package FacadePattern;

class DVDPlayer {
    void on() {

        System.out.println("DVD Player is ON");
    }

    void play(String movie) {

        System.out.println("Playing movie: " + movie);
    }

    void off() {
        System.out.println("DVD Player is OFF");
    }
}
