package FacadePattern;

class SoundSystem {
    void on() {
        System.out.println("Sound System is ON");
    }

    void setVolume(int level) {
        System.out.println("Sound volume set to: " + level);
    }

    void off() {
        System.out.println("Sound System is OFF");
    }
}
