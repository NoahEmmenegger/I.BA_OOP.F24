package KW12.Schnittstellen;

/**
 * Interface for switchable devices.
 */
public interface CountingSwitchable extends Switchable {
    /**
     * Returns the number of times the device has been switched on.
     * 
     * @return the number of times the device has been switched on
     */
    long getSwitchCount();
}
