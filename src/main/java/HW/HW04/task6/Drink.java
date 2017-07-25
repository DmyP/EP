package HW.HW04.task6;

public enum Drink   {
    SPRING_WATER("Spring water", DrinkType.SPARKLING_WATER),
    COCA_COLA("Coca cola", DrinkType.SPARKLING_WATER),
    SPRITE("Sprite", DrinkType.SPARKLING_WATER),
    FANTA("Fanta", DrinkType.SPARKLING_WATER),
    ESPRESSO("Espresso", DrinkType.COFFEE),
    AMERICANO("Americano", DrinkType.COFFEE),
    BLACK_TEA("Black tea", DrinkType.TEA),
    GREEN_TEA("Green tea", DrinkType.TEA),
    MINT_TEA("Mint tea", DrinkType.TEA),
    HERBAL_TEA("Herbal tea", DrinkType.TEA);

    private final String name;
    private final DrinkType type;

    Drink(String name, DrinkType type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return type.toString() + " - " + name;
    }
}
