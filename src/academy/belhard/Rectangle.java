package academy.belhard;

public class Rectangle extends Figure implements AreaCalculator, PerimeterCalculator {
    protected double a;
    protected double b;
    private final String NAME_OF_FIGURE="Прямоугольник";

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }


    @Override
    public double calculatePerimeter() {
        return (a+b)*2;
    }

    @Override
    public String toString() {
        return '{'+
                NAME_OF_FIGURE +
                "  1 сторона=" + a +
                ", 2 сторона=" + b +
                ", площадь=" + calculateArea() +
                ", периметр=" + calculatePerimeter() +
                '}';
    }
}
