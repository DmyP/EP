package HW03_inheritance.task3;

public class Ring extends Shape {
    private double radius;

    Ring(double radius) {
        this.radius = radius;
    }

    @Override
    double getSquare() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "\n" + "Ring\t\t\tradius - " + radius +
                "\t\t\t\tsquare - " + getSquare();
    }
}
