package HW03_inheritance.task4.usingComposition;


import java.util.Arrays;

public class PlanetC {
    private String planetName;
    private EntityC[] mainlands;
    private EntityC[] islands;
    private EntityC[] oceans;

    PlanetC(){
        this("Random Planet", (int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
    }

    PlanetC(String name, int mainlandNum, int islandNum, int oceanNum) {
        this.planetName = name;
        this.mainlands = new Mainland[mainlandNum];
        this.islands = new Island[islandNum];
        this.oceans = new Ocean[oceanNum];
        for (int i = 0; i < mainlandNum; i++) {
            this.mainlands[i] = new Mainland();
        }
        for (int i = 0; i < islandNum; i++) {
            this.islands[i] = new Island();
        }
        for (int i = 0; i < oceanNum; i++) {
            this.oceans[i] = new Ocean();
        }

    }

    public void print() {
        System.out.println("Planet Name=" + planetName + '\n' +
                "mainlands - " + mainlands.length + " - " + Arrays.toString(mainlands) + "\n" +
                "islands - " + islands.length + " - " + Arrays.toString(islands) + "\n" +
                "oceans - " + oceans.length + " - " + Arrays.toString(oceans));
    }
}
