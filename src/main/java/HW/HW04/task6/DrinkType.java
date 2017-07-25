package HW.HW04.task6;

public enum DrinkType {

    SPARKLING_WATER("Sparkling water"),
    TEA("Tea"),
    COFFEE("Coffee");

    private final String name;

    DrinkType(final String type) {
        this.name = type;
    }



    public String getDisplayableType() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

