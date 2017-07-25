package HW03_inheritance.task3;

class Parallelogram extends Shape {
    private double height;
    private double base;

    Parallelogram(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double getSquare() {
        return base * height;
    }

    @Override
    public String toString() {
        return "\n" + "Parallelogram\theight - " + height +
                "\tbase - " + base +
                "\tsquare - " + getSquare();
    }
}
