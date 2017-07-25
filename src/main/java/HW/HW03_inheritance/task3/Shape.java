package HW.HW03_inheritance.task3;

abstract class Shape {
    private static double squareSum;

    abstract double getSquare();

    static double sumShapeSquare(Shape[] shapes) {
        for (Shape shape: shapes){
            squareSum += shape.getSquare();
        }
        return squareSum;
    }

}
