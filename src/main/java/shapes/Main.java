package shapes;

public class Main {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        tri1.height = 100;
        tri1.base = 80;
        tri1.calculateArea();

        Square sqr1 = new Square();
        sqr1.side = 20;
        sqr1.calculateArea();


        Circle cir1 = new Circle();
        cir1.radius = 5;
        cir1.calculateArea();




    }
}
