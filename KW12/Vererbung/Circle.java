package KW12.Vererbung;

public final class Circle extends Shape {
    private int diameter;

    public Circle(final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(final int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return this.diameter;
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * this.diameter);
    }

    public int getArea() {
        // math.pow is like r^2
        return (int) (Math.PI * Math.pow(this.diameter / 2, 2));
    }

    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 10);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());
    }

}
