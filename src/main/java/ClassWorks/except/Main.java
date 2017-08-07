package ClassWorks.except;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b == 0) {
            System.out.println("sorry 0");
        } else {
            System.out.println(10 / 0);
        }

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
