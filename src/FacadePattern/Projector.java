package FacadePattern;

class Projector {
    void on() {
        System.out.println("Projector is ON");
    }

    void setInput(String source) {

        System.out.println("Projector input set to: " + source);
    }

    void off() {

        System.out.println("Projector is OFF");
    }
}
