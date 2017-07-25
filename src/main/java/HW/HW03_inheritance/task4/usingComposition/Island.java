package HW03_inheritance.task4.usingComposition;

class Island extends EntityC {
    Island() {
        setEntityName("Island #" + (int)(Math.random() * 1000));
    }
}
