package HW03_inheritance.task4.usingComposition;

class EntityC {
    private String entityName;

    String getEntityName() {
        return entityName;
    }

    void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public String toString() {
        return entityName;
    }
}
