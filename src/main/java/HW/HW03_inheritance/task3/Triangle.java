package HW03_inheritance.task3;

public class Triangle extends Shape {
    private double height;
    private double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double getSquare() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "\n" + "Triangle\t\theight - " + height +
                "\tbase - " + base +
                "\tsquare - " + getSquare();
    }
}
