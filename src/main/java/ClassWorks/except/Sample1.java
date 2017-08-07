package ClassWorks.except;

public class Sample1 {
    public static void main(String[] args) {
        try {
            System.out.println("Hi");
            //System.out.println(10 / 0);
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
    }
}
