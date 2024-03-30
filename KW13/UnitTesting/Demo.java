
package KW13.UnitTesting;

/**
 * Beschreiben Sie hier die Klasse Demo.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Demo {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Demo
     */
    public Demo() {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int max(int a, int b) {
        // tragen Sie hier den Code ein
        return a > b ? a : b;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int max(int a, int b, int c) {
        // tragen Sie hier den Code ein
        return a > b ? a : b > c ? b : c;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int maxBesser(int a, int b, int c) {
        if (a > b) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int min(int a, int b) {
        // tragen Sie hier den Code ein
        return a < b ? a : b;
    }
}
