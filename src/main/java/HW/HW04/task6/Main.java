package HW.HW04.task6;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nList of drink types\n");
        for (DrinkType drinkType : DrinkType.values()) {
            System.out.println(drinkType);
        }
        System.out.println("\nList of drinks\n");
        for (Drink drink : Drink.values()) {
            System.out.println(drink);
        }
    }

}
