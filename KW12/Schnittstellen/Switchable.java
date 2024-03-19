package KW12.Schnittstellen;

/**
 * Interface for switchable devices.
 */
public interface Switchable {
    /**
     * Switches the device on.
     */
    void switchOn();

    /**
     * Switches the device off.
     */
    void switchOff();

    /**
     * Checks if the device is switched on.
     * 
     * @return true if the device is switched on, false otherwise
     */
    boolean isSwitchedOn();

    /**
     * Checks if the device is switched off.
     * 
     * @return true if the device is switched off, false otherwise
     */
    boolean isSwitchedOff();
}
