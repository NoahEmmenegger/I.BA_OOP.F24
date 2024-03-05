
/**
 * Beschreiben Sie hier die Klasse Temperatur.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Temperatur
{
    private double earthTempCelsius;
    
    /**
     * Konstruktor für Objekte der Klasse Temperatur
     */
    public Temperatur()
    {
        this.earthTempCelsius = 20;
    }

    /**
     * Overload Konstruktor für Objekte der Klasse Temperatur
     */
    public Temperatur(double initEarthTempCelsius)
    {
        this.earthTempCelsius = initEarthTempCelsius;
    }
    
    public double getEarthTempCelsius() {
        return earthTempCelsius;
    }
    
    public void setEarthTempCelsius(double newTemp) {
        this.earthTempCelsius = newTemp;
    }
    
    public double getEarthTempKelvin() {
        return earthTempCelsius + 273.15;
    }
    
    public double getEarthTempFahreinheit() {
        return earthTempCelsius * 1.8 + 32;
    }
    
    public void increaseTemp(double add) {
        this.earthTempCelsius += add;
    }
    
    
    public void decreaseTemp(double sub) {
        this.earthTempCelsius -= sub;
    }
    
    public AggregatszustandEnum getAggregatszustand(ChemicalElement chemicalElement) {
        return chemicalElement.getAggregatszustand(_temp_);
    }
}
