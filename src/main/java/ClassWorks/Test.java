package ClassWorks;

public class Test {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        System.out.println(test.equals(test));
        System.out.println(test.equals(null));
    }

}
