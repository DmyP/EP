package HW.HW02_arrays;

public class Dispatcher {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.init();
        controller.selectTaskToRun();

    }
}