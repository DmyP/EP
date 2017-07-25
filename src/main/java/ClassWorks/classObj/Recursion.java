package ClassWorks.classObj;

public class Recursion {
    static int sum = 1;

    public static void main(String[] args) {
        System.out.println(getFactSimpl(5));
        System.out.println(getFactHard(5));

        Double d1 = 3.3333d;
        Double d2 = 3.3333d;
        System.out.println(d1 == d2);

    }

    static long getFactSimpl(int x) {
        if (x == 1 ) {
            return x;
        }
        return x * getFactSimpl(x - 1);
    }

    static long getFactHard (long x) {
        return x * check(x);
    }

    static long check(long x) {
        if (x == 1 ) {
            return x;
        }
        return getFactHard(x - 1);
    }



}
