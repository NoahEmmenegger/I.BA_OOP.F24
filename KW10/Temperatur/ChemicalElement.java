
/**
 * Beschreiben Sie hier die Klasse ChemicalElement.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ChemicalElement
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name = "Stickstoff";
    
    private int boilingPoint = 3;
    private int MeltingPoint = 3;
    private int FreezingPoint = 3;

    /**
     * Konstruktor für Objekte der Klasse ChemicalElement
     */
    public ChemicalElement(String newName, int newBP, int newMP, int newFP)
    {
        // Instanzvariable initialisieren
        name = newName;
        boilingPoint = newBP;
        MeltingPoint = newMP;
        FreezingPoint = newFP;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public AggregatszustandEnum getAggregatszustand(double temp) {
        return AggregatszustandEnum.Fest;
    }
}
