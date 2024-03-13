package KW11.Schnittstellen;

public class Fahrzeug implements Switchable {
    private Motor motor;
    private Licht licht;
    private boolean switchedOn;

    public Fahrzeug() {
        this.motor = new Motor();
        this.licht = new Licht();
        this.switchedOn = false;
    }

    public void switchOn() {
        motor.switchOn();
        licht.switchOn();
        switchedOn = true;
    }

    public void switchOff() {
        motor.switchOff();
        licht.switchOff();
        switchedOn = false;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public boolean isSwitchedOff() {
        return !switchedOn;
    }
}
