package Prob1;

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    Rectangle(String color, double side) {
        super(color);
        this.width = side;
        this.length = side;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
}
