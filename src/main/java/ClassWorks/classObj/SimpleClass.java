package ClassWorks.classObj;

public class SimpleClass {
    public SimpleClass() {
        this(30, "Constructor1");
    }
    public SimpleClass(int a) {
        System.out.println("Constructor2" + a);
    }
    public SimpleClass(int a, String s) {
        System.out.println("Constructor3" + a + s);
    }

    public static void main(String[] args) {
        SimpleClass sc1 = new SimpleClass();
        SimpleClass sc2 = new SimpleClass(20);
        SimpleClass sc3 = new SimpleClass(20, "hello");
    }
}
