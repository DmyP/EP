package ClassWorks.except;

public class Sample3 {
    public static void main(String[] args) {
        try (Aa a = new Aa()){

        } catch (Exception e){

        }
    }
}
class Aa implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }
}
