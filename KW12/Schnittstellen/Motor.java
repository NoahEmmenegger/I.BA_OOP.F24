package KW12.Schnittstellen;

public class Motor implements Switchable {
    /**
     * Umdrehungen pro Minute.
     */
    private int rpm;

    /**
     * Konstruktor.
     * 
     * @param rpm Umdrehungen pro Minute
     */
    public Motor() {
        this.rpm = 0;
    }

    public void switchOn() {
        this.rpm = 1000;
        System.out.println("Motor switched on.");
    }

    public void switchOff() {
        this.rpm = 0;
        System.out.println("Motor switched off.");
    }

    public boolean isSwitchedOn() {
        return true;
    }

    public boolean isSwitchedOff() {
        return false;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void printStatus() {
        System.out.println("Motor rpm: " + rpm);
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.switchOn();
        motor.printStatus();
        motor.switchOff();
        motor.printStatus();
    }
}
