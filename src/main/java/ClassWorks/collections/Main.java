package ClassWorks.collections;

public class Main {

    public static void main(String[] args) {
        Box<String> b1 = new Box<>("10");
        Box<Integer> b2 = new Box<>(5);

        System.out.println(b1.getClass() == b1.getClass());
        System.out.println(b1.getItem());
        System.out.println(b2.getItem());
    }
}
