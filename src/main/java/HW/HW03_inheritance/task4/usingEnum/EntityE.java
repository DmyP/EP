package HW03_inheritance.task4.usingEnum;

class EntityE {
    private String entityName;
    private EntityType entityType;

    public EntityE(EntityType entityType, String entityName) {
        this.entityName = entityName;
        this.entityType = entityType;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    @Override
    public String toString() {
        return entityType + " name - " + entityName;
    }
}
