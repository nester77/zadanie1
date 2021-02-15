package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Figure figure1 = new Triangle( 4, 3);
        Figure figure2 = new Circle(7);
        Figure figure3 = new Rectangle(2,5);


        figure1.printInfo();
        figure2.printInfo();
        figure3.printInfo();

    }
}
