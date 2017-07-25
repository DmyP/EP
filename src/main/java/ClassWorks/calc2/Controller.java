package ClassWorks.calc2;

public class Controller {
    public int sum (Model m) {
        return  m.getA() + m.getB();
    }
    public int sud (Model m) {
        return  m.getA() - m.getB();
    }
    public int multiply (Model m) {
        return  m.getA() * m.getB();
    }
    public double div (Model m) {
        return (double) (m.getA() / m.getB());
    }


}
