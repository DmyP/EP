package HW.HW01_triangles;

import java.util.Scanner;

public class Triangle {
    private static String SELECT_SHAPE = "Select triangle shape to draw 1-5 - ";
    private static String SELECT_LENGTH = "Select triangle side size 2-1000 - ";
    private static String OUT_OF_RANGE = "Out of range, please try again";
    private static String STAR = "* ";
    private static String SPACE = "  ";
    private static String NEW_LINE = "\n";

    public static void main(String[] args) {
        print(SELECT_LENGTH);
        int length = getInt(0, 1000);
        print(SELECT_SHAPE);
        int i = getInt(1, 5);
        shapeSelector(i, length);
    }

    private static void shapeSelector(int i, int length) {
        switch (i) {
            case 1:
                shape1(length);
                break;
            case 2:
                shape2(length);
                break;
            case 3:
                shape3(length);
                break;
            case 4:
                shape4(length);
                break;
            case 5:
                shape5(length);
                shape5(length);
                break;
        }
    }

    private static void shape1(int length) {
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                print((j == 0 || i == length || j == i - 1) ? STAR : SPACE);
            }
            print(NEW_LINE);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                print((j == i || j == 0 || i == length - 1) ? STAR : SPACE);
            }
            print(NEW_LINE);
        }
    }

    private static void shape2(int length) {
          for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= 0; j--) {
                print(( j == i ||i == length - 1 || j == 0) ? STAR : SPACE);
            }
            print(NEW_LINE);
        }
    }

    private static void shape3(int length) {
        for (int i = 0; i <= length - 1; i++) {
            for (int j = length - 1; j >= 0; j--) {
                print((j == i || j == 0 || i == length - 1) ? STAR : SPACE);
            }
            print(NEW_LINE);
        }
    }

    private static void shape4(int length) {
        shape3(length);
        shape2(length);
    }

    private static void shape5(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length * 2; j++) {
                print((j == length - 1 || j == length || i == length - 1 || j == length - 1 - i || j == length + i) ? STAR : SPACE);
            }
            print(NEW_LINE);
        }
    }

    //Get int input in desired range
    private static int getInt(int from, int to) {
        int result;
        Scanner scanner = new Scanner(System.in);
        while (((result = Integer.valueOf(scanner.nextLine())) < from) || (result > to)) {
            System.out.println(OUT_OF_RANGE);
        }
        return result;
    }

    //Prints String
    private static void print(String str) {
        System.out.print(str);
    }
}