package academy.belhard;

public class Triangle extends Figure implements AreaCalculator, PerimeterCalculator {
    private double a;
    private double b;
    private final String NAME_OF_FIGURE="Прямоугольный треугольник";

    public Triangle ( double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
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
