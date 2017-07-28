package ClassWorks.interfaces;

interface Calc {
    int calc(int a, int b);
}

public class Main implements A{

    public static void main(String[] args) {
        Calc add = (a, b) -> a + b;

    }
    public void meth() {

    }
}
