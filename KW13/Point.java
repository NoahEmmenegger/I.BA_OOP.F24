package KW13;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point(int x, int y) {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int beispielMethode(int y) {
        // tragen Sie hier den Code ein
        return x + y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point p) {
        this.x += p.x;
        this.y += p.y;
    }

    public void moveRelative(double polarAngle, double distance) {
        this.x += distance * Math.cos(polarAngle);
        this.y += distance * Math.sin(polarAngle);
    }

    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0; // Punkt liegt auf einer Achse oder im Nullpunkt
        }
    }
}
