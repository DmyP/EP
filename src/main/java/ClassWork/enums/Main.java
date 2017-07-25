package ClassWorks.enums;

public class Main {
    public static void main(String[] args) {
        Seasons[] arr = Seasons.values();

        for (Seasons s : arr) {
            s.walk();
            System.out.println("Avarage temperature - " + s.temperature);
            switch (s) {
                case WINTER:
                    System.out.println("New year");
            }
        }
    }
}
