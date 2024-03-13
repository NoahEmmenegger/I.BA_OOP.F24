package KW11.Datenkapselung;

public class Line {
    private Point start;
    private Point end;
    
    public Line(Point iStart, Point iEnd) {
        this.start = iStart;
        this.end = iEnd;
    }

    public Point getStart() {
        return this.start;
    }

    public void setStart(Point iStart) {
        this.start = iStart;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point iEnd) {
        this.end = iEnd;
    }

    public static void main(String[] args) {
        Point start = new Point(0, 0);
        Point end = new Point(1, 1);
        Line line = new Line(start, end);
        System.out.println("Start: " + line.getStart().toString());
        System.out.println("End: " + line.getEnd().toString());
        line.setStart(new Point(2, 2));
        line.setEnd(new Point(3, 3));
        System.out.println("Start: " + line.getStart().toString());
        System.out.println("End: " + line.getEnd().toString());
    }
}
