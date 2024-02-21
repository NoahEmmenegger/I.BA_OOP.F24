
/**
 * Beschreiben Sie hier die Klasse Fahrrad.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrrad
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    
    private boolean isElectric = false;
    
    private String name;
    
    private FahrradType type = FahrradType.Stadtfahrrad;

    /**
     * Konstruktor für Objekte der Klasse Fahrrad
     */
    public Fahrrad()
    {
        // Instanzvariable initialisieren
        x = 0;
    }
    
    public boolean getIsElectric()
    {
        return isElectric;
    }
    
    public FahrradType getType() {
        return type;
    }
    
    public void setFahrradType(FahrradType newType)
    {
        type = newType;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
