package hr.algebra.tracefood.webapp.model;

public enum UserType {
    PROCESSOR("Processor"),

    SELLER("Seller"),

    PRODUCER("Producer"),

    HORECA("HoReCa");

    private final String displayName;

    private UserType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

}

