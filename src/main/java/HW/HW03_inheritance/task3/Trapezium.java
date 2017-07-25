package HW03_inheritance.task3;

public class Trapezium extends Shape {
    private double height;
    private double baseTop;
    private double baseBottom;

    Trapezium(double height, double baseTop, double baseBottom) {
        this.height = height;
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
    }

    @Override
    double getSquare() {
        return (baseTop + baseBottom) * height / 2;
    }

    @Override
    public String toString() {
        return "\n" + "Trapezium\theight - " + height +
                "\tbaseTop - " + baseTop +
                "\tbaseBottom - " + baseBottom +
                "\tsquare - " + getSquare();
    }
}
