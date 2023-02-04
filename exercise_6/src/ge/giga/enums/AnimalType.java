package ge.giga.enums;

public enum AnimalType {
    DOMESTIC("Domestic"),
    WILD("Wild");

    private String readableType;

    AnimalType(String readableType) {
        this.readableType = readableType;
    }

    public String getReadableType() {
        return readableType;
    }

    @Override
    public String toString() {
        return readableType;
    }
}
