package ClassWorks.polymorph;

public class A {
    static void meth() {
        System.out.println("A");
    }
    public static void main(String[] args) {
            A a = new B();
            a.meth();
    }
}
class B extends A {
    static void meth() {
        System.out.println("B");
    }
}
