package KW11.Schnittstellen;

public class Licht implements Switchable {
    private int brightness;

    public boolean isSwitchedOn() {
        // Überprüfung, ob das Licht eingeschaltet ist
        return this.brightness > 0;
    }

    public boolean isSwitchedOff() {
        // Überprüfung, ob das Licht ausgeschaltet ist
        return this.brightness == 0;
    }

    public void switchOn() {
        this.brightness = 1000;
        System.out.println("Licht switched on.");
    }

    public void switchOff() {
        this.brightness = 0;
        System.out.println("Licht switched off.");
    }
}
