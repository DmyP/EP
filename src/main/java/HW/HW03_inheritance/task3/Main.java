package HW03_inheritance.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = generateShapesArray();

        System.out.println("Shapes in ClassWorks.array are - " + Arrays.toString(shapes));
        System.out.println("Shapes square sum is  - " + Shape.sumShapeSquare(shapes));
    }

    private static Shape[] generateShapesArray() {
        System.out.println("Generating random ClassWorks.array...");
        Shape[] shapes = new Shape[(int) (Math.random() * 10)];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = randomShapeGenerator();
        }
        return shapes;
    }

    private static Shape randomShapeGenerator() {
        switch ((int) (Math.random() * 4)) {
            case 0 :
            case 1 :
                return new Ring(randomInt());
            case 2 :
                return new Triangle(randomInt(), randomInt());
            case 3 :
                return new Parallelogram (randomInt(), randomInt());
            case 4 :
                return new Trapezium(randomInt(), randomInt(), randomInt());
            }
            return new Ring(randomInt());
        }

    private static double randomInt() {
        return Math.round(Math.random() * 20);
    }
}

