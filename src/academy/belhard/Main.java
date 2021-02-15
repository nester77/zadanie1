package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Figure figure1 = new Triangle( 4, 3);
        Figure figure2 = new Circle(7);
        Figure figure3 = new Rectangle(2,5);


        printInfoFigure(figure1);
        printInfoFigure(figure2);
        printInfoFigure(figure3);


    }
    
    public static void printInfoFigure(Figure figure) {
         System.out.println(figure.toString());
    }

}
