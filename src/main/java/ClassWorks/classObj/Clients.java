package ClassWorks.classObj;

public class Clients {
    final int A_1 = 10;
    final int A_2 = method();
    final int A_3;
    final int A_4;
    static final int A_4a;

    static {
        A_4a = 0;
    }

    {
        A_4 = 10;

    }


    public Clients() {
        A_3 = 3;
    }

    private int method() {
        return 5;
    }
}
