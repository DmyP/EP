package ClassWorks.calc2;

public class Main {
    public static void main(String[] args) {
        Model m = new Model(10, 20);

        Controller c = new Controller();
        int result = c.sum(m);

        View v = new View();
        v.printResult(result);





    }
}