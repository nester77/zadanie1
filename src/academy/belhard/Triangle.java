package academy.belhard;

public class Triangle extends Figure implements AreaCalculator, PerimeterCalculator {
    protected double a;
    protected double b;
    private final String NAME_OF_FIGURE="Четырехугольник";

    public Triangle (int sideCounter, double a, double b) {
        super(sideCounter);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a*b)/2;
    }


    @Override
    public double calculatePerimeter() {
        return (a+b)*2;
    }

}
