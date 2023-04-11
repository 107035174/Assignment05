package Prob1;

public class Main {
    public static void main(String[] args) {
        Shape[] s = {new Shape("Red"),
                new Circle("Green", 5),
                new Rectangle("Blue", 4, 5),
                new Square("Black", 5),
                new Square("White", 6)};
        printTotal(s);
    }

    public static void printTotal(Shape[] shapes) {
        for (Shape o : shapes) {
            System.out.println(o.color + " " + o.getClass().getSimpleName() + "'s area is " + o.calculateArea() + " and perimeter is " + o.calculatePerimeter());
        }
    }
}
