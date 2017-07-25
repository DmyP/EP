package HW03_inheritance.task4.usingEnum;

import java.util.Random;

class PlanetE {
    private String planetName;
    private EntityE[] entities;

    PlanetE(){
        this("Random Planet", (int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
    }

    PlanetE(String name, int mainlandNum, int islandNum, int oceanNum) {
        this.planetName = name;
        this.entities = new EntityE[mainlandNum + islandNum + oceanNum];
        for (int i = 0; i < mainlandNum; i++) {
            entities[i] = new EntityE(EntityType.MAINLAND, EntityType.MAINLAND.toString() + "_" + (int) (Math.random() * 1000));
        }
        for (int i = mainlandNum; i < mainlandNum + islandNum; i++) {
            entities[i] = new EntityE(EntityType.ISLAND, EntityType.ISLAND.toString() + "_" +  (int) (Math.random() * 1000));
        }
        for (int i = mainlandNum + islandNum; i < mainlandNum + islandNum + oceanNum;  i++) {
            entities[i] = new EntityE(EntityType.OCEAN, EntityType.OCEAN.toString() + "_" +  (int) (Math.random() * 1000));
        }
    }

    public void print() {
        System.out.println("Planet name - " + planetName + "\n");
        int mainlandCount = 0, islandCount = 0, oceansCount = 0;
        for (int i = 0; i < entities.length; i++) {
            System.out.println(entities[i]);
            switch (entities[i].getEntityType()) {
                case MAINLAND:
                    mainlandCount++;
                    break;
                case ISLAND:
                    islandCount++;
                    break;
                case OCEAN:
                    oceansCount++;
                    break;
            }
        }
        System.out.println("\nquantity by types:");
        System.out.println(EntityType.MAINLAND + " - " + mainlandCount);
        System.out.println(EntityType.ISLAND + " - " + islandCount);
        System.out.println(EntityType.OCEAN + " - " + oceansCount);
    }
}
