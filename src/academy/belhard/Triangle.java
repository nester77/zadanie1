package academy.belhard;

public class Triangle extends Figure implements AreaCalculator, PerimeterCalculator {
    protected double a;
    protected double b;
    private final String NAME_OF_FIGURE="Прямоугольный треугольник";

    public Triangle ( double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a*b)/2;
    }


    @Override
    public double calculatePerimeter() {
        return a+b+Math.sqrt(a*a+b*b);
    }

    @Override
    public String toString() {
        return '{'+
                NAME_OF_FIGURE +
                "  1 катет=" + a +
                ", 2 катет=" + b +
                ", площадь=" + calculateArea() +
                ", периметр=" + calculatePerimeter() +
                '}';
    }
}
