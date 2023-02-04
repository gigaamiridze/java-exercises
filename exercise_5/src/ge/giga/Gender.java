package ge.giga;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private String readableGender;

    Gender(String readableGender) {
        this.readableGender = readableGender;
    }

    public String getReadableGender() {
        return readableGender;
    }

    @Override
    public String toString() {
        return "Gender: " + readableGender;
    }
}
