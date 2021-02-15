package academy.belhard;

public class Circle extends Figure implements AreaCalculator, PerimeterCalculator {
    private double r;
    private final String NAME_OF_FIGURE="Круг";

    public Circle (double r) {
        this.r = r;
        }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }


    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return '{'+
                NAME_OF_FIGURE +
                "  радиус=" + r +
                ", площадь=" + calculateArea() +
                ", периметр=" + calculatePerimeter() +
                '}';
    }
}
